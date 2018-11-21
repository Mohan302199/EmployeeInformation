package EmployeeLibrary;

public interface Calculation {
    public int salary(int numberOfHolidays,int salaryPerHour,int prepaid);
    public int insurance(int numberOfInsuredPeople, int InsurranceAmount);
    public int taxToBePaid(int salry);
}
