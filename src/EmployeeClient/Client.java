package EmployeeClient;

import EmployeeLibrary.*;


    public class Client {
    public static void main(String[] args) {


        try {
            EmployeeDetails employeeDetails = new CompanyUseOnly(
                    "Mohan",                     //First name
                    "Murugesan",               //Lastname
                    "1998 02 12",                     // date of birth ( YYYY MM DD)
                    "Male",                              //Gender (Male / Female)
                    "Kodumudi",                         // Address
                    "97a6986811",                  //Mobile number
                    "mohanmurugesan02@gmail.com", //personal e-mail id
                    "Single",                       //Marital Status (single/ Maried)
                    "2000 02 20",                   //Date of Joining ( YYYY MM DD)
                    "Developer",                      //Job position
                    3000,                           //salary per hour
                    "CNZ36598",               // Pan number
                    1,                      // Number of peopele to be insured
                    23330,                        //Advance Salary
                    2                                //Leaves taken in nu ber of days
                    );
            ((CompanyUseOnly) employeeDetails).displaySalary();
            employeeDetails.calculateIncentive();

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}
