//Safiya Nieves
//CSE 2
//lab04
//09/17/2014

//PURPOSE
//  computes cost of purchasing Big Macs and fries dependant on user input of number of Big Macs and fries purchased
//  Uses logic statement to prevent invalid use entries

//import Scanner class
import java.util.Scanner;

    //define class
    public class BigMacAgain
    {
        
        //add main method
        public static void main (String [] args)
        {

            //call scanner constructor and instruct it to take inputs
            Scanner userInput = new Scanner (System.in);
            
            int nBigMacs;
            double bigMac$ = 2.22;
            double costBigMac;
            String friesYN;
            
            
            System.out.print ("Enter the number of Big Macs (int>0) :");

            if (userInput.hasNextInt())
            {
                nBigMacs = userInput.nextInt();
                
                if (nBigMacs > 0)
                {
                    costBigMac = nBigMacs * bigMac$;
                    System.out.println ("You ordered " + nBigMacs + " Big Macs for a cost of " + nBigMacs + " x $" + bigMac$ + "= $" + costBigMac );    
                
                    System.out.println ("Do you want an order of fries? (y, Y, n, N): ");
                    friesYN = userInput.next();
                    
                    if (friesYN.equalsIgnoreCase("y"))
                    {
                        System.out.println("Your ordered fries at a cost of $2.15");
                        System.out.println("The total cost of your meal is $" + (2.15+costBigMac));
                    }
                    
                    else if (friesYN.equalsIgnoreCase("n"))
                    {
                        System.out.println("The total cost of your meal is $" + costBigMac); 
                    }
                    
                    else
                    {
                        System.out.println("You did not enter y, Y, n, or N.");
                        return;
                    }
                    
                }
                
                else
                {
                    System.out.println ("You did not enter an int > 0");
                }
            }
          
            else
            {
                System.out.println ("You did not enter an int > 0");    
            }
          
            }
    
        }        

    