//Safiya Nieves
//09.16.2014
//CSE2 HW 03
//Program 1. Bicycle.java

//PURPOSE
//  Given user input, print the distance, speed, and time traveled

//ISSUES
//  problem statement did not specify format of output.  
//  I declared all variables as double to provide more precise numbers

//import Scanner class
import java.util.Scanner;

    //define class
    public class Bicycle
    {
    
        //add main method
        public static void main (String [] args)
        {
        
            //constant variables.  static values.  Do not edit or reassign.
            //given from hw and lab assignments
            double wheelDiameter = 27.0;  //wheel diameter in inches
            double PI = 3.14159; //value of pi.  used in calcs involving circles
            double feetPerMile = 5280; //number of feet in length per length mile
            double inchesPerFt = 12; //number of inches in length per length foot
            double secondsPerMin = 60; //number of seconds in time per time minute 
            double minPerHr = 60; //number of mins in time per time hour
                
            //dynamic variables.  values obtained from user entry or calculations
            double nCounts; //number of counts of wheel rotations using cyclometer.  Delcared as double to allow for partial rotations
            double nSeconds; //number of seconds for record period.  Declared as double to allow partial seconds
            double distanceTrip; //distance traveled.  Declared as double to allow partial units of length
            double speed; //speed of trip during record period.  Declared as double to provide precision
                
            //declare instance of scanner object ot accept input
            //call scanner and instruct it to take inputs
            Scanner userInput = new Scanner (System.in);
            
            //request information from user
            //values for variables are required before computation can occur
            System.out.print ("Enter the number of seconds traveled during your recorded trip:"); //request time traveled during record period
            nSeconds = userInput.nextDouble(); //accept input
            
            System.out.print ("Enter the count of tire rotations during your recorded trip:"); //request number of tire rotations.  required to determine distance
            nCounts = userInput.nextDouble(); //accept input
            
            //calculations
            distanceTrip = wheelDiameter*PI*nCounts; // distance in inches. obtained by circumference*# of full wheel rotations. 
            distanceTrip = distanceTrip / nSeconds / feetPerMile; //converts from inches to miles
                
            speed = distanceTrip / nSeconds; //distance of trip in miles/seconds.  not recorded in inch/sec because distanceTrip was refinded prior to speed calc.
            speed = speed * secondsPerMin * minPerHr; //coverts speed from mi/sec to mph
            
            //print calculations
            System.out.println ("The distance traveled during this period was " + distanceTrip + " miles and took " + (nSeconds/secondsPerMin) + " minutes.");
            System.out.println ("The average speed during this period was " + speed + " mph.");
            
        //end 
        }
    
    //close    
    }
    