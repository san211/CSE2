//Safiya Nieves
//HW 06
//10.14.2014
//Program 2 Root

//PURPOSE: use bisection method to find root of a user input number


//import scanner class
import java.util.Scanner;

    //define class
    public class Root
    {
        
        //add main method
        public static void main (String [] args)
        {
        
        //declare scanner variable
        Scanner userInput=new Scanner(System.in);
        
        //other variable declaration
        //initialize to 0 until other values are introduced
        double low = 0;
        double x = 0;
        double high = 0;
        double middle = 0;

        //request input
        System.out.print ("Please enter a double > 0:  ");
        x = userInput.nextDouble();
        

        //chk input greater than 0
        if (x>0)
        {

            high = 1 + x;
            middle = (high + low) / 2;
        
            while ((high-low) > 0.0000001*(1+x))
            {
                if (middle * middle > x)
                {
                    high =  middle;
                }
        
                else 
                {
                    low = middle; 
                }

                middle = (low + high) / 2;
            }
            
            //print root
            System.out.println("The root of " + x + " is ~= " + middle);
        }
        else 
        {
            System.out.println ("You did not enter a double > 0.");
            return;
        }

 
        
        }
    }    