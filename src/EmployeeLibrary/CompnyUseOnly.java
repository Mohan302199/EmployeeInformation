package EmployeeLibrary;

public class CompnyUseOnly extends EmployeeDetails {
    private String employeePANNnmber;
    private boolean isInsured;
    private int numberOfInsuredPeople;
    private int advanceAmount;

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
}
