package EmployeeLibrary;


import java.time.*;
import java.time.format.DateTimeFormatter;


public abstract class   EmployeePersonalDetails {

    private String employeeFirstName;
    private String employeeSecondName;
    private String dateOfbirth;
    private int age;
    private String gender;
    private String address;
    private String mobileNumber;
    private String emergencyContact;
    private String personalEmailid;
    private String maritalStatus;


    public EmployeePersonalDetails() {
    }
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");


    public EmployeePersonalDetails(String employeeFirstName, String employeeSecondName, String dateOfbirth, String gender, String address, String mobileNumber, String emergencyContact, String personalEmailid, String maritalStatus) {
        this.employeeFirstName = employeeFirstName;
        this.employeeSecondName = employeeSecondName;
        this.dateOfbirth = dateOfbirth;
        this.age =age(dateOfbirth);
        this.gender = gender;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.emergencyContact = emergencyContact;
        this.personalEmailid = personalEmailid;
        this.maritalStatus = maritalStatus;
    }

    public int age(String dateOfbirth){
        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday = LocalDate.parse(dateOfbirth,dateTimeFormatter);  //Birth date
        Period period = Period.between(birthday, today);
        return period.getYears();
    }

// **********************getters & Setters**********************************************
    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeSecondName() {
        return employeeSecondName;
    }

    public void setEmployeeSecondName(String employeeSecondName) {
        this.employeeSecondName = employeeSecondName;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getPersonalEmailid() {
        return personalEmailid;
    }

    public void setPersonalEmailid(String personalEmailid) {
        this.personalEmailid = personalEmailid;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
