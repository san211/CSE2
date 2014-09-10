//Safiya Nieves
//09.16.2014
//CSE2 HW 03
//Program 3. FourDigits.java

//PURPOSE
//  Request a number from the user and print the first four digits to the right of the implied or existing decimal point

//ISSUE
//  when testing with very very long numbers, output is incorrect.  THis may be due to storage space of double
//  values need to be limited to match the storage space of the variable


//import Scanner class
import java.util.Scanner;

    //define class
    public class FourDigits
    {
        
        //add main method
        public static void main (String [] args)
        {
            
            //declare instance of scanner object to accept input
            //call scanner and instruct it to take inputs
            Scanner userInput = new Scanner (System.in);
            
            double x; //user input.  value for which user is requesting the first four digits to the right of the decimal
            
            int tenth; //value of first digit of output
            int hundreth; //value of second digit of output
            int thousandth; //value of third digit of output
            int tenThousandth; // value of fourth digit of output
            
            //text edited to my preference.  differs from sample provided in problem statement
            //request input from user
            System.out.print ("Enter a number and I will display the first four digits to the right of the decimal - ");
            x = userInput.nextDouble(); //accept input
            
            //calculations to return first four digits to the right of the decimal.
            //required to declare x * value into int to eliminate values after requested digit place
            //multiply then divide and return only remainder to obtain value of place
            tenth = (int)(x * 10) % 10;
            hundreth = (int)(x * 100) % 10;
            thousandth = (int)(x * 1000) % 10;
            tenThousandth = (int)(x * 10000) % 10;
            
            //output first four digits to the right of the decimal point
            System.out.println ("The first four digits to the right of the decimal are " + tenth + hundreth + thousandth + tenThousandth);
            

            
        
        //end    
        }
        
    //close    
    }