package EmployeeLibrary;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class CompanyUseOnly extends EmployeeDetails implements ICalculation{// Inheritance
    private String employeePANNnmber;     //encapsulation
    private int numberOfInsuredPeople;
    private int advanceAmount;
    private int numberOfSundays =0,numberOfSaturdays=0;
    private LocalDate today =LocalDate.now();
    private int noOfWorkingDays;
    private int leavesTaken;
    private int yearsInCompany;
    private int incentive;



    public CompanyUseOnly(String employeeFirstName, String employeeSecondName, String dateOfbirth, String gender, String address, String mobileNumber, String personalEmailid, String maritalStatus, String dateofJoining, String jobPosition, long salaryPerhour, String employeePANNnmber, int numberOfInsuredPeople, int advanceAmount, int leavesTaken) throws CustomException {
        super(employeeFirstName, employeeSecondName, dateOfbirth, gender, address, mobileNumber,personalEmailid, maritalStatus, dateofJoining,jobPosition,salaryPerhour);
        this.employeePANNnmber = employeePANNnmber;
        if(numberOfInsuredPeople<0){
            throw new CustomException("Hi " + super.getEmployeeFirstName()+", Number of Insured people cannot be Negative");  // Exception handling
        }else {
            this.numberOfInsuredPeople = numberOfInsuredPeople;
        }
        if(advanceAmount<0){
            throw new CustomException("Hi " + super.getEmployeeFirstName()+", Advance amount cannot be Negative");
        }else {
            this.advanceAmount = advanceAmount;
        }
        if(leavesTaken<0){
            throw new CustomException("Hi " + super.getEmployeeFirstName()+", Leaves cannot be Negative");
        }else {
            this.leavesTaken = leavesTaken;
        }
        numberOfWorkingDays();
        try {
            LocalDate dateOfJoining = LocalDate.parse((this.getDateofJoining()), dateTimeFormatter);
            Period period = Period.between(dateOfJoining, today);
            this.yearsInCompany = period.getYears();
        }catch (DateTimeParseException e) {
            throw new CustomException("Hi " + super.getEmployeeFirstName()+", Please enther the Date of joining in correct format YYYY MM DD");

        }
    }

    public void numberOfWorkingDays(){
        noOfWorkingDays=(today.getDayOfMonth())-(holidays(leavesTaken));
    }
    public int salary() {

        return ((noOfWorkingDays*8*(int)this.getSalaryPerHour())-this.advanceAmount-(insurance(numberOfInsuredPeople,300)));
    }


    public int insurance(int numberOfInsuredPeople, int insurranceAmount) {
        return insurranceAmount*numberOfInsuredPeople;
    }


    public double taxToBePaid(int salary) {
        if (super.getAge() <= 60) {
            if (salary <= 300000)
                return 0;
            else if ((salary) > 300000 && (salary <= 500000))
                return (salary * 0.05);
            else if ((salary) > 500000 && (salary <= 1000000))
                return (salary * 0.2);
            else if ((salary) > 1000000)
                return (salary * 0.3);
            else
                return 0;
        } else if (super.getAge() > 60) {
            if (salary <= 250000)
                return 0;
            else if ((salary) > 250000 && (salary <= 500000))
                return (salary * 0.05);
            else if ((salary) > 500000 && (salary <= 1000000))
                return (salary * 0.2);
            else if ((salary) > 1000000)
                return (salary * 0.3);
            else
                return 0;

        }else
            return 0;
    }

    public int holidays(int leavesTaken) {
        LocalDate date = LocalDate.of(today.getYear(), today.getMonth(),1);

        for(int i = 1; date.getDayOfMonth()!=today.getDayOfMonth();i++)
        {
            if(i!=1){
                date = date.plusDays(1);
            }
            String temp = date.getDayOfWeek() + "";
            if( temp.equalsIgnoreCase("SUNDAY")){
                this.numberOfSundays++;
            }else if(temp.equalsIgnoreCase("SATURDAY")){
                this.numberOfSaturdays++;
            }


        }
        return leavesTaken+numberOfSaturdays+ numberOfSundays;
    }
    public void displaySalary(){
        System.out.println(
                "\n\nHello " + getEmployeeFirstName()+
                        ",\n \t\t\t\tHere is your pay slip for the month of " +today.getMonth()+" "+today.getYear()+" till today ("+today+")"+
                        "\nTotal number of working days till today             : " + noOfWorkingDays +"( Holidays : "+this.numberOfSaturdays+" Saturdays, "+this.numberOfSundays +" Sundays, "+leavesTaken+ " Leaves Taken)"+
                        "\nSalary for the working days                         :  "+ (noOfWorkingDays*8*(int)this.getSalaryPerHour())+
                        "\nInsurance amount to be paid                         : -"+(insurance(numberOfInsuredPeople,300))+
                        "\nPrepaid amount                                      : -"+ this.advanceAmount+
                        "\n                                                     -----------" +
                        "\nTotal Amount to be credited as Salary               : Rs."+salary() +
                        "\nTax to be Paid                                      : Rs."+(int)taxToBePaid(salary())+
                        "\n[calculated as per employee age("+this.getAge()+") and Salary]"
                );
    }

    @Override
    public void calculateIncentive(){

        int incentivePercentage = 0;
        System.out.println("\n\t\t\t\t\t\tIncentive Calculator" +
                           "\n\t\t\t\t\t\t--------------------" );


            if(yearsInCompany<=3)
            {
                incentivePercentage =5;
                incentive=((int)(this.getSalaryPerHour()*1.05));
            }
            else {
                if((yearsInCompany>3)  &&(yearsInCompany<=5))
                {
                    incentivePercentage =10;
                    incentive=((int)(this.getSalaryPerHour()*1.10));
                }
                else{
                    if((yearsInCompany>5)  &&(yearsInCompany<=8))
                    {
                        incentivePercentage =15;
                        incentive=((int)(this.getSalaryPerHour()*1.15));
                    }
                    else{
                        if(yearsInCompany>8)
                        {
                            incentivePercentage =20;
                            incentive=((int)(this.getSalaryPerHour()*1.20));
                        }
                    }
                }

            }

        System.out.println("Since you are working in the company for "+ yearsInCompany+" years, Your incentive Percentage is "+incentivePercentage +
                        ".\nHence your Salary per hour from next year will be Rs." +incentive+".");




    }
}
