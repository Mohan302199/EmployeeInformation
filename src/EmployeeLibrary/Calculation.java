package EmployeeLibrary;

public interface Calculation {
    public int salary(int numberOfHolidays,int salaryPerHour,int prepaid,int numberOfInsuredPeople);
    public int insurance(int numberOfInsuredPeople, int insurranceAmount);
    public int taxToBePaid(int salry);
    public int holidays(int leavesTaken);
}
