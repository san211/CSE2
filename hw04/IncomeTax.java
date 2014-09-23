//Safiya Nieves
//09.23.2014
//CSE2 HW 04
//Program 1. Income Tax

//PURPOSE: using an int to respresent income in thousands of dollars, print the tax rate


//import Scanner class
import java.util.Scanner;

    //define class
    public class IncomeTax
    {
    
        //add main method
        public static void main (String [] args)
        {
            //calls Scanner and requests it accept input
            Scanner userInput = new Scanner (System.in);
            
            //request $ amount from user
            System.out.print ("Enter a positive int giving the number of thousands: ");
            
                //if1
                //chks user input = int true or false
                if (userInput.hasNextInt())
                {
                int income = userInput.nextInt();

                
                    //if2
                    //chks value of number over 0
                    if (income>0 & income<20) 
                    {
                    String taxRate = "5.0%"; //to print tax rate
                    double taxDeci = .05; //tax rate value
                    double incomeTx = income * taxDeci *1000; //calc tax
                    System.out.println ("The tax rate on $" + income + "000.00 is " + taxRate + " and the tax is $" + incomeTx); //print statement        
                    }
                    
                    //elseif1
                    //chks value of number for range
                    else if (income>=20 & income<40)
                    {
                    String taxRate = "7.0%";//to print tax rate
                    double taxDeci = .07; //tax rate value
                    double incomeTx = income * taxDeci *1000; //calc tax
                    System.out.println ("The tax rate on $" + income + "000.00 is " + taxRate + " and the tax is $" + incomeTx); //print statement
                    }
                    
                    //elseif2
                    //chks value of number for range
                    else if (income>=40 & income<78)
                    {
                    String taxRate = "12.0%";//to print tax rate
                    double taxDeci = .12; //tax rate value
                    double incomeTx = income * taxDeci *1000; //calc tax
                    System.out.println ("The tax rate on $" + income + "000.00 is " + taxRate + " and the tax is $" + incomeTx); //print statement        
                    }
                    
                    //elseif3
                    //chks value of number for range
                    else if (income>=78)
                    {
                    String taxRate = "14.0%"; //to print tax rate
                    double taxDeci = .14; //tax rate value
                    double incomeTx = income * taxDeci *1000; //calc tax
                    System.out.println ("The tax rate on $" + income + "000.00 is " + taxRate + " and the tax is $" + incomeTx); //print statement         
                    }       
                    
                    //else2
                    //if user input is not > 0
                    else
                    {
                    System.out.println ("You did not enter a positive int");  
                    return;
                    }
                    
                }
            
                //else1
                //if user input is not = int
                else
                {
                System.out.println ("You did not enter an int");
                return;
                }
            
        }
      
    }    