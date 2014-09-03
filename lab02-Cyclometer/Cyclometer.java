//Safiya Nieves
//09.03.2014
//CSE2 LAB02
//PURPOSE
//  print the number of minutes for each trip
//  print the number of counts for each trip
//  print the distance of each trip in miles
//  print the distance for the two trips combined

//create class
public class Cyclometer
{
    //add main method
    public static void main (String[]args)
    {
        //input variables (data input by user).  Store data.
        //int is for integers.  whole numbers only.
        int secsTrip1=480; //length of trip1 in seconds(time)
        int secsTrip2=3320; //length of trip2 in seconds(time)
        int countsTrip1=1561; //count of rotations of front tire during trip1 (number)
        int countsTrip2=9037; //count of rotations of front tire during trip2 (number)
        
        //constant values.  required for calculations.  static values. do not edit.
        //double is for floating point numbers.  We can use comma to continue same line
        double wheelDiameter=27.0; //diameter of the wheel in inches
        double PI=3.14159; //value of pi.  used in calcs involving circles
        double feetPerMile=5280; //number of feet in length per length mile
        double inchesPerFoot=12; //number of inches in length per length foot
        double secondsPerMinute=60; //number of seconds in time per time minute 
        //label result values
        double distanceTrip1, distanceTrip2, totalDistance; //assigning floating number property to results
        
        //print out numbers and calculations
        
        //converts number length of trip1 to time in minutes
        //prints the number of rotations for the duration of trip1
        System.out.println ("Trip 1 took " +(secsTrip1/secondsPerMinute)+ " minutes and had " +countsTrip1+ " counts."); 
        
        //converts number length of trip2 to time in minutes
        //prints the number of rotations for the duration of trip2
        System.out.println ("Trip 2 took " +(secsTrip2/secondsPerMinute)+ " minutes and had " +countsTrip2+ " counts."); 

        //calculate distance of specified trip in inches
        //diameter*PI=circumference.  Distance=circumference*#ofturns
        distanceTrip1=countsTrip1*wheelDiameter*PI; //distrance traveled in inches during trip 1
        distanceTrip2=countsTrip2*wheelDiameter*PI; //distrance traveled in inches during trip 2
        
        //convert trip distances to miles
        distanceTrip1=distanceTrip1/inchesPerFoot/feetPerMile; //distrance traveled in miles during trip 1
        distanceTrip2=distanceTrip2/inchesPerFoot/feetPerMile; //distrance traveled in miles during trip 2
        
        //find distance of both trips
        totalDistance=distanceTrip1+distanceTrip2;
        
        //print out calculations
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles.");
	    System.out.println("The total distance was "+totalDistance+" miles.");

        //end
    }
}
