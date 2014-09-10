//Safiya Nieves
//CSE 2
//lab03
//09/10/2014

//PURPOSE: computes cost of purchasing Big Macs dependant on user input of number of Big Macs purchased

//import Scanner class
import java.util.Scanner;

    //define class
    public class BigMac
    {
        
        //add main method
        public static void main (String [] args)
        {
            //declare instance of scanner object to acccept input
            Scanner myScanner;
            
            //call scanner constructor and instruct it to take inputs
            myScanner = new Scanner (System.in);
            
            //request input from user
            //system.out.print will not cause cursor to move to next line in output
            System.out.print ("Enter the number of Big Macs (an integer > 0): ");  //request # of Big Macs
            int nBigMacs = myScanner.nextInt(); //accept input
            
            //request input from user
            System.out.print ("Enter the cost per Big Mac as " + " a double (in the form xx.xx): "); //request the cost of a Big Mac
            double bigMac$ = myScanner.nextDouble (); //accept input
            
            //request input from user
            System.out.print ("Enter the percent tax as a whole number (xx): "); //request the sales tax as a number, not a percentage
            double taxRate = myScanner.nextDouble(); //accept input
            
            taxRate/= 100;  //user entry is in a whole number.  this will convert to a decimal based on whole number percentage
            
            double cost$;  //define variable that will tell the cost of n Big Macs
            int dollars;  //define whole number value of dollars required
            int dimes;  // define whole number value of dimes required
            int pennies;  // define whole number value of pennies required
            
            cost$ = nBigMacs * bigMac$ * (1+taxRate); //calulate total cost of Big Mac (cost + tax)
            
            dollars = (int) cost$; //change cost to int to receive cost with truncation error to provide whole number amount
            dimes = (int) (cost$ * 10) %10;  //change cost to int then divide by ten to receive remainder.  remainder with truncation error will provide # of dimes
            pennies = (int) (cost$ * 100) %10;  //change cost to int then divde to receive reaminder.  remainder with truncation error will provide # of pennies
            
            System.out.println ("The total cost of " + nBigMacs + " Big Macs, at $" + bigMac$ + " per Big Mac, with a sales tax of " + (int)(taxRate*100) + "%, is $" + dollars + "." + dimes + pennies );
            
            
            
        }
    }