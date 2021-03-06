package EmployeeLibrary;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class EmployeeDetails implements ICalculation {// Class
    private String employeeFirstName;
    private String employeeSecondName;
    private String dateOfbirth;
    private int age;
    private String gender;
    private String address;
    private String mobileNumber;
    private String personalEmailid;
    private String maritalStatus;
    private static int employeeId;
    private String dateofJoining;
    private String jobPosition;
    private String companyMailId;
    private long salaryPerHour;
    private static int count =100;



//                              **************Constructor*******************


    public EmployeeDetails(){
        employeeId = count++;
    }//constructor over loading
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd"); // date formatter


    public EmployeeDetails(String employeeFirstName, String employeeSecondName, String dateOfbirth, String gender, String address, String mobileNumber, String personalEmailid, String maritalStatus, String dateofJoining, String jobPosition,long salaryPerHour)throws CustomException {
        this();
        this.employeeFirstName = employeeFirstName;
        this.employeeSecondName = employeeSecondName;
        this.dateOfbirth = dateOfbirth;
        this.age =age(dateOfbirth);
        this.gender = gender;
        this.address = address;

            if (mobileNumber.length() == 10) {
                try
                {
                    long mobileNumberIntiger = Long.parseLong(mobileNumber);
                    this.mobileNumber = mobileNumber;
                }catch (NumberFormatException e){
                    throw new CustomException("Hi " + employeeFirstName+", Mobile number cannot contain letters");
                }

            } else {
                throw new CustomException("Hi " + employeeFirstName+", Please Enter your mobile number correctly with 10 digits");
            }


        this.personalEmailid = personalEmailid;
        this.maritalStatus = maritalStatus;
        this.dateofJoining = dateofJoining;
        this.jobPosition = jobPosition;
        if(salaryPerHour<=0){
            throw new CustomException("Hi " + employeeFirstName+", Salary per hour canot be negative or zero");
        }else{
            this.salaryPerHour = salaryPerHour;
        }
        this.companyMailId = employeeFirstName.toLowerCase() + this.employeeId + "@maveric-systems.com";

        System.out.println("\n\n\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * "
                        +"\n\t\t\t\t\t*  Hello "+ employeeFirstName +" "+ employeeSecondName+
                                ",\n\t\t\t\t\t* \t\t\tWelcome to Maveric systems" +
                                "\t\t\t\t*\n\t\t\t\t\t*  Your Employee Id is " + this.employeeId +
                                "\t\t\t\t\t\t\t*\n\t\t\t\t\t*  Your Mail id is "+this.companyMailId+
                                "\n\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * "

        );
    }
//                          ****************Functions****************
    public int age(String dateOfbirth) throws CustomException {
        try {
            LocalDate today = LocalDate.now();                          //Today's date     //Localdate class ( Class presentation)
            LocalDate birthday = LocalDate.parse(dateOfbirth, dateTimeFormatter);  //Birth date
            Period period = Period.between(birthday, today);
            return period.getYears();
        }
        catch (DateTimeParseException e) {
            throw new CustomException("Hi " + employeeFirstName+", Please enther the Date of birth in correct format YYYY MM DD");

        }

    }



//                          *******************Getters & Setters***************


    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public int getAge() {
        return age;
    }

    public String getDateofJoining() {
        return dateofJoining;
    }

    public long getSalaryPerHour() {
        return salaryPerHour;
    }


}
