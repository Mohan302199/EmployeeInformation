    package EmployeeClient;

import EmployeeLibrary.*;


    public class Client {
    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails("MOhan",
                "Murugesan",
                "1998 02 13",
                "Male",
                "Kodumudi",
                "9786986811",
                "9025638538",
                "mohanmurugesan02@gmail.com",
                "Single",
                "13 02 2018",
                " Citi",
                "Developer",
                "java",
                3000
                );

        System.out.println((employeeDetails).getCompanyMailId());
                System.out.println(
                "Age is : "+ employeeDetails.getAge()+
                        "\n DOB : " + employeeDetails.getDateOfbirth()
        );





    }
}
