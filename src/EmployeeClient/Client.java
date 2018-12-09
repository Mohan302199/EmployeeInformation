package EmployeeClient;

import EmployeeLibrary.*;

/*
                        *********************Documentation****************
                        * This project contains Employee management system.
                        * It can be used for calculating the salary today(The date in which project is Compiled and runned).
                        * The code is written in a manner that it automatically finds the age of the person with DOB and Experience in the company with date of joining
                        * Tax calculation is done with the rules of IT department as the tax rates differs for senior citizens
                        * Incentive is calculated based on the experience in company

*/
    public class Client {
    public static void main(String[] args) {


        try {
            EmployeeDetails employeeDetails = new CompanyUseOnly(    //object
                    "Mohan",                     //First name
                    "Murugesan",               //Lastname
                    "1998 02 13",                     // date of birth ( YYYY MM DD)
                    "Male",                              //Gender (Male / Female)
                    "Kodumudi",                         // Address
                    "9786986811",                  //Mobile number
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


            EmployeeDetails employeeDetails1 = new CompanyUseOnly(    //object
                    "Gowtham",                     //First name
                    "Saminathan",               //Lastname
                    "1996 11 30",                     // date of birth ( YYYY MM DD)
                    "Male",                              //Gender (Male / Female)
                    "Arachalur",                         // Address
                    "7413698512",                  //Mobile number
                    "sskgowtham95@gmail.com", //personal e-mail id
                    "Single",                       //Marital Status (single/ Maried)
                    "2006 02 20",                   //Date of Joining ( YYYY MM DD)
                    "Developer",                      //Job position
                    2000,                           //salary per hour
                    "CNZ36988",               // Pan number
                    2,                      // Number of peopele to be insured
                    2330,                        //Advance Salary
                    1                                //Leaves taken in nu ber of days
            );
            EmployeeDetails employeeDetails2 = new CompanyUseOnly(    //object
                    "Vinothini",                     //First name
                    "Sakthivel",               //Lastname
                    "1995 09 05",                     // date of birth ( YYYY MM DD)
                    "Femle",                              //Gender (Male / Female)
                    "Anthiyur",                         // Address
                    "7632657896",                  //Mobile number
                    "vinothinisakthivel@gmail.com", //personal e-mail id
                    "Single",                       //Marital Status (single/ Maried)
                    "2016 10 11",                   //Date of Joining ( YYYY MM DD)
                    "Tester",                      //Job position
                    1000,                           //salary per hour
                    "CNZ39888",               // Pan number
                    0,                      // Number of peopele to be insured
                    0,                        //Advance Salary
                    3                                //Leaves taken in nu ber of days
            );
            ((CompanyUseOnly) employeeDetails).displaySalary();
            employeeDetails.calculateIncentive();

            ((CompanyUseOnly) employeeDetails1).displaySalary();
            employeeDetails1.calculateIncentive();

            ((CompanyUseOnly) employeeDetails2).displaySalary();
            employeeDetails2.calculateIncentive();



        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }


    }
}
