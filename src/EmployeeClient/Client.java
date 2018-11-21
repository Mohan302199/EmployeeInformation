    package EmployeeClient;

import EmployeeLibrary.*;


    public class Client {
    public static void main(String[] args) {
        EmployeePersonalDetails employeeCompanyDetails= new EmployeeCompanyDetails("Mohan",
                "Murugesan",
                "1998 02 13",
                "Male",
                "Kodumudi",
                "9786986811",
                "9025638538",
                "mohanmurugesan02@gmail.com",
                "Single",
                "2018 02 13",
                "Developer",
                "Junior",
                "Java");

        System.out.println(((EmployeeCompanyDetails) employeeCompanyDetails).getCompanyMailId());
        System.out.println(
                "Age is : "+ employeeCompanyDetails.getAge()
        );





    }
}
