//Safiya Nieves
//CSE 2
//hw 08
//10/28/2014

//PURPOSE
//  Prepare two overload methods

import java.util.Scanner;

public class HW8
{
	//START GET INPUT I
	public static char getInput (Scanner inputI, String requestI)
	{
	
	String xI;
	//dowhile loop to continue to request input until user enters string of length 1
	//ran as do while so will run at least once.  this will allow to chck for valid entry
	do
    	{
    		//assign value for input by user
    		xI = inputI.next();
    		
    		switch (xI)
    		{
    			case "c":
    			case "C":
    			break;
    				
    			//continue loop if entry is not equal to C or c
    			default: xI = "xxxxxx";
    			System.out.print("You did not enter a character from the list 'Cc'; try again- ");
    			break;
    		}
    	}
		while (xI.length() > 1 || xI.length() < 1);	
    	
	//assigns string into char
    char zI = xI.charAt(0);
    //returns char
    return zI;	
    //END GET IPUT I
    }  
    
    //START GET INPUT II
    public static char getInput (Scanner inputII, String requestII, int i)
	{
	
	String xII;
	int j = 0;
	char zII;
	
	//dowhile loop to continue to request input until user enters string of length 1
	//ran as do while so will run at least once.  this will allow to chck for valid entry
	do
    	{
    		//assign value for input by user
    		xII = inputII.next();
    		
    		switch (xII)
    		{
    			case "y":
    			case "Y":
    			case "N":
    		 	case "n":
    		 	j++;
    			break;
    				
    			//continue loop if entry is not equal to yYnN
    			// space before string to return string " " if invalid entry.
    			//character entry will not read from if statement in main
    			default: xII = " xxxxx";
    			System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
    			j++;
    			break;
    		}
    	}
		while ((xII.length() > 1 | xII.length() < 1) & j < 5);	
    
    //failure message only appears if all attempts are exhausted
    if (j == 5)
    {
    	System.out.println ("You failed after 5 tries");
    }
	
	//assigns string into char
    zII = xII.charAt(0);
    //returns char
	return zII;	
    //END GET INPUT II
	}
    
     //START GET INPUT III
    public static char getInput (Scanner inputIII, String digitIII, String requestIII)
	{
	
	String xIII;
	char zIII;
	
	//dowhile loop to continue to request input until user enters string of length 1
	//ran as do while so will run at least once.  this will allow to chck for valid entry
	do
    	{
    		//request input
    		System.out.print ("Choose a digit - ");
    		xIII = inputIII.next();
    		
    		switch (xIII)
    		{
    			//if string is int 0-9
    			case "0":
    			case "1":
    			case "2":
    		 	case "3":
    		 	case "4":
    		 	case "5":
    		 	case "6":
    		 	case "7":
    		 	case "8":	
    		 	case "9":
    			break;
    				
    			//continue loop if entry is not equal to request
    			default: xIII = "xxxxx";
    			System.out.print("You did not enter an acceptable character \n");
    			break;
    		}
    	}
		while (xIII.length() > 1 | xIII.length() < 1);	
    
	//assigns string into char
    zIII = xIII.charAt(0);
    //returns char
	return zIII;	
    //END GET INPUT III
	}
    
    //main method
    public static void main(String []arg)
    {
	
	char input;
	
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	
	//GET INPUT I
	input=getInput(scan,"Cc");
	
	System.out.println("You entered '"+input+"'");
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	
	//GET INPUT II
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	
	if(input!=' ')
	{
	    System.out.println("You entered '"+input+"'");
	}
	
	//GET INPUT III	
	input=getInput(scan,"Choose a digit.","0123456789");

	System.out.println("You entered '"+input+"'");
	
    }  
}
