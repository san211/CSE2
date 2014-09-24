//Safiya Nieves
//09.23.2014
//CSE2 HW 04
//Program 4. TimePadding

//PURPOSE: given the number of seconds determine the time


//import Scanner class
import java.util.Scanner;

    //define class
    public class TimePadding
    {
    
        //add main method
        public static void main (String [] args)
        {
            //calls Scanner and requests it accept input
            Scanner userInput = new Scanner (System.in);
            
            //variable declaration
            int hours;
            int mins;
            int seconds;
            String hrs;
            String mns;
            String sec;
            
            //request int from user
            System.out.print ("Enter the time in seconds (int): ");
            
                //chk that input is integer            
                if (userInput.hasNextInt())
                {
                //assign input    
                int time = userInput.nextInt();

                    //chks int > 0 and in range
                    if (time<0 | time>86400) 
                    {
                    System.out.println ("Invalid entry.  Time measurements must be for same day.");
                    return; 
                    }
                    else
                    {
                    hours = time/3600;
                    mins = (time%3600)/60;
                    seconds = time - ((hours*3600) + (mins*60));
                    }

                    //set of ifs to allow for leading zeros when value is less than 10
                    if (hours<10)
                    {
                    hrs = "0"+hours;   
                    }
                    else 
                    {
                    hrs = ""+hours;
                    }    
                
                    if (mins<10)
                    {
                    mns = "0"+mins;   
                    }
                    else 
                    {
                    mns =""+mins;
                    }    
                    
                    if (seconds<10)
                    {
                    sec = "0"+seconds;   
                    }
                    else 
                    {
                    sec = ""+seconds;
                    }
                    
                //print time     
                System.out.println ("The time is " + hrs + ":" +mns+ ":" +sec+ ".");
                    
                }     
                
                //if entry is invalid
                else    
                {
                System.out.println("Invalid entry.  Must be an int greater than 0.");    
                return;
                }
                
    }    }