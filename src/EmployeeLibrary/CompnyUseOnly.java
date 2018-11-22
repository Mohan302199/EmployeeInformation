package EmployeeLibrary;

import java.time.LocalDate;

public class CompnyUseOnly extends EmployeeDetails implements Calculation{
    private String employeePANNnmber;
    private boolean isInsured;
    private int numberOfInsuredPeople;
    private int advanceAmount;
    private int numberOfSundys=0,numberOfSaturdays=0;


    public CompnyUseOnly(String employeePANNnmber, boolean isInsured, int numberOfInsuredPeople, int advanceAmount) {
        this.employeePANNnmber = employeePANNnmber;
        this.isInsured = isInsured;
        this.numberOfInsuredPeople = numberOfInsuredPeople;
        this.advanceAmount = advanceAmount;
    }

    public CompnyUseOnly(String employeeFirstName, String employeeSecondName, String dateOfbirth, String gender, String address, String mobileNumber, String emergencyContact, String personalEmailid, String maritalStatus, String dateofJoining, String department, String jobPosition, String areaOfSpecialisation, long salaryPerhour, String employeePANNnmber, boolean isInsured, int numberOfInsuredPeople, int advanceAmount) {
        super(employeeFirstName, employeeSecondName, dateOfbirth, gender, address, mobileNumber, emergencyContact, personalEmailid, maritalStatus, dateofJoining, department, jobPosition, areaOfSpecialisation, salaryPerhour);
        this.employeePANNnmber = employeePANNnmber;
        this.isInsured = isInsured;
        this.numberOfInsuredPeople = numberOfInsuredPeople;
        this.advanceAmount = advanceAmount;
    }

    @Override
    public int salary(int numberOfHolidays, int salaryPerHour, int prepaid) {
        int finalSalary;
        LocalDate today = LocalDate.now();
        System.out.println(today.getMonthValue());
        return 0;
    }

    @Override
    public int insurance(int numberOfInsuredPeople, int InsurranceAmount) {
        return 0;
    }

    @Override
    public int taxToBePaid(int salry) {
        return 0;
    }

    @Override
    public int holidays(int leavesTaken) {
        LocalDate today =LocalDate.now();
        LocalDate date = LocalDate.of(today.getYear(), today.getMonth(),1);

        for(int i = 1; date.getDayOfMonth()!=today.getDayOfMonth();i++)
        {
            date = date.plusDays(1);
            String temp = date.getDayOfWeek() + "";
            if( temp.equalsIgnoreCase("SUNDAY")){
                this.numberOfSundys++;
            }else if(temp.equalsIgnoreCase("SATURDAY")){
                this.numberOfSaturdays++;
            }


        }
        return leavesTaken+numberOfSaturdays+numberOfSundys;
    }
}
