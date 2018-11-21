package EmployeeLibrary;

import java.util.Date;

public class EmployeePersonalDetails {

    private String employeeFirstName;
    private String employeeSecondName;
    private Date dateOfbirth;
    private String gender;
    private String address;
    private String mobileNumber;
    private String emergencyContact;
    private String personalEmailid;
    private String maritalStatus;
    private String age;

//    public EmployeePersonalDetails() {
//    }

    public EmployeePersonalDetails(String employeeFirstName, String employeeSecondName, Date dateOfbirth, String gender, String address, String mobileNumber, String emergencyContact, String personalEmailid, String maritalStatus) {
        this.employeeFirstName = employeeFirstName;
        this.employeeSecondName = employeeSecondName;
        this.dateOfbirth = dateOfbirth;
        this.gender = gender;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.emergencyContact = emergencyContact;
        this.personalEmailid = personalEmailid;
        this.maritalStatus = maritalStatus;
    }

}
