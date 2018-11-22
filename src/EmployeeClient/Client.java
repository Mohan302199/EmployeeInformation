package EmployeeClient;

import EmployeeLibrary.*;


    public class Client {
    public static void main(String[] args) {
        EmployeeDetails employeeDetails = null;

        try {
            employeeDetails = new CompanyUseOnly(
                    "Mohan",                     //First name
                    "Murugesan",               //Lastname
                    "1998 02 13",                     // date of birth ( YYYY MM DD)
                    "Male",                              //Gender (Male / Female)
                    "Kodumudi",                         // Address
                    "9786986811",                  //Mobile number
                    "mohanmurugesan02@gmail.com", //personal e-mail id
                    "Single",                       //Marital Status (single/ Maried)
                    "13 02 2018",                   //Date of Joining ( YYYY MM DD)
                    "Developer",                      //Job position
                    3000,                           //salary per hour
                    "CNZ36598",               // Pan number
                    1,                      // Number of peopele to be insured
                    0,                             //Advance Salary
                    2                                //Leaves taken in nu ber of days
                    );
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        ((CompanyUseOnly) employeeDetails).displaySalary();
    }
}
