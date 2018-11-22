    package EmployeeClient;

import EmployeeLibrary.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;


    public class Client {
    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new CompnyUseOnly(
                "MOhan",                     //First name
                "Murugesan",               //Lastname
                "1998 02 13",                     // date of birth ( YYYY MM DD)
                "Male",                              //Gender (Male / Female)
                "Kodumudi",                         // Address
                "9786986811",                  //Mobile number
                "9025638538",               //Emergency Contact
                "mohanmurugesan02@gmail.com", //personal e-mail id
                "Single",                       //Marital Status (single/ Maried)
                "13 02 2018",                   //Date of Joining ( YYYY MM DD)
                " Citi",                          //Department o work
                "Developer",                      //Job position
                "java",                    // Area of Specialisation
                3000,                           //salary per hour
                "CNZ36598",               // Pan number
                true,                              //Do you need insurance
                1,                      // Number of peopele to be insured
                0                             //Advance Salary
                );

        System.out.println(((CompnyUseOnly) employeeDetails).holidays(2));






    }
}
