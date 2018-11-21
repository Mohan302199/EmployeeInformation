package EmployeeLibrary;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class EmployeeDetails {
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
    private static int employeeId;
    private String dateofJoining;
    private String department;
    private String jobPosition;
    private String areaOfSpecialisation;
    private String companyMailId;
    private long salaryPerHour;
    private int count =100;



//                              **************Constructor*******************


    public EmployeeDetails(){
        employeeId = count++;
    }
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");


    public EmployeeDetails(String employeeFirstName, String employeeSecondName, String dateOfbirth, String gender, String address, String mobileNumber, String emergencyContact, String personalEmailid, String maritalStatus, String dateofJoining, String department, String jobPosition, String areaOfSpecialisation, long salaryPerHour) {
        this();
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
        this.dateofJoining = dateofJoining;
        this.department = department;
        this.jobPosition = jobPosition;
        this.areaOfSpecialisation = areaOfSpecialisation;
        this.salaryPerHour = salaryPerHour;
        this.companyMailId = employeeFirstName.toLowerCase() + this.employeeId + "@maveric-systems.com";

        System.out.println(
                        "Hello "+ employeeFirstName +" "+ employeeSecondName+"," +
                                "\n \t\t\tWelcome to Maveric systems" +
                                "\n Your Employee Id is " + this.employeeId +
                                "\n Your Mail id is "+this.companyMailId

        );
    }
//                          ****************Functions****************
    public int age(String dateOfbirth){
        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday = LocalDate.parse(dateOfbirth,dateTimeFormatter);  //Birth date
        Period period = Period.between(birthday, today);
        return period.getYears();
    }



//                          *******************Getters & Setters***************


    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeSecondName() {
        return employeeSecondName;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public String getPersonalEmailid() {
        return personalEmailid;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public static int getEmployeeId() {
        return employeeId;
    }

    public String getDateofJoining() {
        return dateofJoining;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public String getAreaOfSpecialisation() {
        return areaOfSpecialisation;
    }

    public String getCompanyMailId() {
        return companyMailId;
    }

    public long getSalaryPerHour() {
        return salaryPerHour;
    }

    public int getCount() {
        return count;
    }
}
