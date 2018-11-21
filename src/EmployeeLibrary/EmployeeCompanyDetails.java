package EmployeeLibrary;

public class EmployeeCompanyDetails extends EmployeePersonalDetails{
    private static int employeeId;
    private String dateofJoining;
    private String department;
    private String jobPosition;
    private String areaOfSpecialisation;
    private String companyMailId;
    private String  salaryPerhour;
    private int count =100;


    public EmployeeCompanyDetails(String employeeFirstName, String employeeSecondName, String dateOfbirth, String gender, String address, String mobileNumber, String emergencyContact, String personalEmailid, String maritalStatus, String dateofJoining, String department, String jobPosotion, String areaOfSpecialisation) {
        super(employeeFirstName, employeeSecondName, dateOfbirth, gender, address, mobileNumber, emergencyContact, personalEmailid, maritalStatus);
        employeeId = count++;
        this.dateofJoining = dateofJoining;
        this.department = department;
        this.jobPosition = jobPosotion;
        this.areaOfSpecialisation = areaOfSpecialisation;
        this.companyMailId = employeeFirstName.toLowerCase() + this.employeeId + "@maveric-systems.com";
    }





//                              *********Getters & setters********

    public static int getEmployeeId() {
        return employeeId;
    }

    public static void setEmployeeId(int employeeId) {
        EmployeeCompanyDetails.employeeId = employeeId;
    }

    public String getDateofJoining() {
        return dateofJoining;
    }

    public void setDateofJoining(String dateofJoining) {
        this.dateofJoining = dateofJoining;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getAreaOfSpecialisation() {
        return areaOfSpecialisation;
    }

    public void setAreaOfSpecialisation(String areaOfSpecialisation) {
        this.areaOfSpecialisation = areaOfSpecialisation;
    }

    public String getCompanyMailId() {
        return companyMailId;
    }

    public void setCompanyMailId(String companyMailId) {
        this.companyMailId = companyMailId;
    }

    public String getSalaryPerhour() {
        return salaryPerhour;
    }

    public void setSalaryPerhour(String salaryPerhour) {
        this.salaryPerhour = salaryPerhour;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
