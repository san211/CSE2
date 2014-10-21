//Safiya Nieves
//CSE 2
//hw 07
//10/21/2014

//PURPOSE
//  Print a pattern for the user

//import Scanner class
import java.util.Scanner;

    //define class
    public class NumberStack
    {
        
        //add main method
        public static void main (String [] args)
        {

            //call scanner constructor and instruct it to take inputs
            Scanner userInput = new Scanner (System.in);
            
            //variables
            int entry;
            int i;
            int j;
            int k;
            int m;
            
            System.out.print("Enter a number (int) between 1 and 9: ");
            //chks entry = int
            if (userInput.hasNextInt())
            {
                entry = userInput.nextInt();
                //chks entry > 0
                if (entry > 0 & entry < 10)
                {
                    
                    //FOR
                    System.out.println ("\nUsing FOR loops\n");
                    
                    //determines number of tiers
                    for (i = 1; i <= entry ; i++)
                    {
                        //prints correct# of rows per tier
                        for (m = 1; m <= i; m++)
                        {
                            //prints 9-entry spaces before printing number tier
                            for (j = (entry - i); j>0 ; j--)
                            {
                                System.out.print(" ");
                            }
                            //prints tier.  number of prints are 2 * tier# - 1
                            for (k = 0; k < (i*2)-1; k++)
                            {
                                System.out.print(i);
                            }
                            //next line.  
                            System.out.println();
                        //end of loop for tier specifications    
                        }
                        //prints space before - row
                        for (j = (entry - i); j>0 ; j--)
                        {
                            System.out.print(" ");
                        }
                        //prints - row.  number of prints are 2*tier# - 1
                        for (k = 0; k < (i*2)-1; k++)
                        {
                            System.out.print("-");
                        }
                        //next line
                        System.out.println();
                    //end of FOR loops   
                    }
                 
                    //WHILE
                    //same as FOR loop.  variable initializations declared just outside of loop.  Increments occur in loop after action.
                    System.out.println("\nUsing WHILE loops\n");
                    
                    i=1;
                    while (i <= entry)
                    {
                        
                        m=1;
                        while (m <= i)
                        {
                            
                            j = (entry - i); 
                            while (j > 0)
                            {
                                System.out.print(" ");
                                j--;
                            }
                        
                            k=0;
                            while (k < (i*2)-1)
                            {
                                System.out.print(i);
                                k++;
                            }
                            
                            System.out.println();
                            
                            m++;
                            
                        }
                        
                        j = (entry - i);
                        while (j > 0)
                        {
                            System.out.print(" ");
                            j--;
                        }
                        
                        k=0;
                        while (k < (i*2)-1)
                        {
                            System.out.print("-");
                            k++;
                        }
                    
                        System.out.println();
                        
                        i++;
                    //end of WHILE loops    
                    }
                    
                     //DO WHILE

                    System.out.println("\nUsing DO WHILE loops\n");
                    
                    i=1;
                    do
                    {
                        m=1;
                        do
                        {
                            j = (entry - i); 
                            do
                            {
                                j--;
                                System.out.print(" "); 
                            }
                            while (j > -1);
                                                    
                            k=0;
                            do
                            {
                                System.out.print(i);
                                k++;
                            }
                            while (k < (i*2)-1);
                            
                            System.out.println();
                            
                            m++;
                            
                        }
                        while (m <= i);
                        
                        
                        
                        j = (entry - i);
                        do
                        {
                            System.out.print(" ");
                            j--;
                        }
                        while (j > -1);
                        
                        k=0;
                        do
                        {
                            System.out.print("-");
                            k++;
                        }
                        while (k < (i*2)-1);
                    
                        System.out.println();
                        
                        i++;
                      
                    }
                    while (i <= entry);
                    //end of DO WHILE
                    
                    
                    
                    
                    
                    
                }
                
                
                //if entry not >0
                else
                {
                    System.out.println("You did not enter an int between 1 and 9.");
                    return;
                }
                
            }
            //if entry not an int
            else
            {
                System.out.println("You did not enter an int between 1 and 9.");
                return;
            }
            
            
        }    
    }    