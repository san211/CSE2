//Safiya Nieves
//09.23.2014
//CSE2 HW 04
//Program 2. Month

//PURPOSE: given a month an year print the number of days in the month


//import Scanner class
import java.util.Scanner;

    //define class
    public class Month
    {
    
        //add main method
        public static void main (String [] args)
        {
            //calls Scanner and requests it accept input
            Scanner userInput = new Scanner (System.in);
            
            //request int from user
            System.out.print ("Enter an int giving the number of the month (1-12): ");
            

                //chks user input = int true or false
                if (userInput.hasNextInt())
                {
                int month = userInput.nextInt();

                    //chks int > 0
                    if (month<=0)  
                    {
                    System.out.println ("You did not enter a positive int");
                    return;
                    }
                    
                    //chcks if month has 31 days
                    else if (month==1 | month==3 | month==5 | month==7 | month==8 | month==10 | month==12)
                    {
                    System.out.println ("This month has 31 days."); //print statement        
                    }
                    
                    //chcks if month has 30 days
                    else if (month==4 | month==6 | month==9 | month==11)
                    {
                    System.out.println ("This month has 30 days."); //print statement  
                    }
                    
                    //chcks if month is february
                    else if (month==2)
                    {
                        
                    //requests year for february    
                    System.out.print("Enter an int giving the year (pos values will be AD. neg values will be BC): ");
                        
                        //chcks that year is valid year int
                        if (userInput.hasNextInt())
                        {
                        int year = userInput.nextInt();
                        
                            //chks for leap year
                            if (year%4 == 0)
                            {
                            System.out.println ("This month has 29 days.");    
                            }
                            else
                            {
                            System.out.println ("This month has 28 days.");    
                            }
                        }
                        
                        //if user input is invalid
                        else
                        {
                        System.out.println ("You did not enter a valid year");
                        return;
                        }
                    }
                    
                    //if month is not between (1-12)
                    else
                    {
                    System.out.println ("You did not enter a valid month");  
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