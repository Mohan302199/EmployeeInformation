package EmployeeLibrary;

import java.util.Date;

public class EmployeeCompanyDetails extends EmployeePersonalDetails{
    private static int employeeId;
    private Date dateofJoining;
    private String department;
    private String jobPosition;
    private String areaOfSpecialisation;
    private String companyMailId;
    private String  salaryPerhour;
    private int count =01;

//    public EmployeeCompanyDetails(){
//
//        employeeId = count++;
//    }

    public EmployeeCompanyDetails(String employeeFirstName, String employeeSecondName, Date dateOfbirth, String gender, String address, String mobileNumber, String emergencyContact, String personalEmailid, String maritalStatus, Date dateofJoining, String department, String jobPosotion, String areaOfSpecialisation) {
        super(employeeFirstName, employeeSecondName, dateOfbirth, gender, address, mobileNumber, emergencyContact, personalEmailid, maritalStatus);
        employeeId = count++;
        dateofJoining = dateofJoining;
        this.department = department;
        this.jobPosition = jobPosotion;
        this.areaOfSpecialisation = areaOfSpecialisation;
        this.companyMailId = employeeFirstName + this.employeeId + "@maveric-systems.com";
    }
}
