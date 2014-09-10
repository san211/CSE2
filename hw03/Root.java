//Safiya Nieves
//09.16.2014
//CSE2 HW 03
//Program 2. Root.java

//PURPOSE
//  Esimate the cube root of a user input number and return the estimate to the user

//ISSUES
//  Estimate is inacurate for larger numbers.  More than 5 iterations would be required to obtain a more correct value


//import Scanner class
import java.util.Scanner;

    //define class
    public class Root
    {
    
        //add main method
        public static void main (String [] args)
        {
            
            
            //declare instance of scanner object to accept input
            //call scanner and instruct it to take inputs
            Scanner userInput = new Scanner (System.in);
            
            double x; //user input.  value the user is requesting we find the cube root for
            double root; //root of the user input
            
            //print out edited from text in problem statement to more accurately reflect program function
            System.out.print ("Enter a number and I will estimate its cube root - ");//request a number from the user
            x = userInput.nextDouble(); //accept input
            
            root = x/3; //crude guess
            
            //5 iterations to estimate root as requested in the hw problem statement
            root = (2*root*root*root+x)/(3*root*root); //iteration 1
            root = (2*root*root*root+x)/(3*root*root); //iteration 2
            root = (2*root*root*root+x)/(3*root*root); //iteration 3
            root = (2*root*root*root+x)/(3*root*root); //iteration 4
            root = (2*root*root*root+x)/(3*root*root); //iteration 5
            
            //print results so they are user friendly
            System.out.println("The cube root is " + root );
            System.out.println("  " + root + " * " + root + " * " + root + " = " + (root*root*root));
        
        
        //end    
        }  
        
    //close    
    }    