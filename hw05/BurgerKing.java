//Safiya Nieves
//09.30.2014
//CSE2 HW 05
//Program 1. Burger King

//PURPOSE: Given user input . Print a statement describing the customer's order.

//import Scanner class
import java.util.Scanner;

//import all
import java.io.*;

    //define class
    public class BurgerKing
    {
    
        //add main method
        public static void main (String [] args)
        {
            //calls Scanner and requests it accept input
            Scanner userInput = new Scanner (System.in);
            
            //variable declaration
            String choiceOut = "";
            String selection;
            String option;
            
            //request item ordered
            System.out.println ("Enter a letter to select a choice of: ");
            System.out.print ("     Burger (b or B)\n     Soda (s or S)\n     Fries (f or F)\n::");
            selection = userInput.next();    
        
            //select input only if string length = 1
            if (selection.length()==1)
            {
            
                //customize burger
                if (selection.equalsIgnoreCase("b"))
                {
                    System.out.println ("How would you like your burger?");
                    System.out.print ("     \"All the fixins\" (a or A)\n     Cheese (c or C)\n     No Toppings (n or N)\n::");
                    option = userInput.next();
                
                    switch (option)
                    {
                        case "a": choiceOut = "You ordered a burger with \"all the fixins.\"";
                        break;
                    
                        case "A": choiceOut = "You ordered a burger with \"all the fixins.\"";
                        break;
                    
                        case "c": choiceOut = "You ordered a burger with cheese.";
                        break; 
                    
                        case "C": choiceOut = "You ordered a burger with cheese.";
                        break; 
                    
                        case "n": choiceOut = "You ordered a burger with no toppings.";
                        break; 
                    
                        case "N": choiceOut = "You ordered a burger with no toppings.";
                        break;
                    
                        default: choiceOut = "Invalid Selection";
                    }
                
                }
            
            
                //customize soda
                else if (selection.equalsIgnoreCase("S"))
                {
                    System.out.println ("What soda would you like?");
                    System.out.print ("     Pepsi (p or P)\n     Coke (c or C)\n     Sprite (s or S)\n     Mountain Dew (m or M)\n::");
                    option = userInput.next();
                
                    switch (option)
                    {
                        case "p": choiceOut = "You ordered a Pepsi";
                        break;
                    
                        case "P": choiceOut = "You ordered a Pepsi";
                        break;
                    
                        case "c": choiceOut = "You ordered a Coke";
                        break; 
                    
                        case "C": choiceOut = "You ordered a Coke";
                        break; 
                    
                        case "s": choiceOut = "You ordered a Sprite";
                        break; 
                    
                        case "S": choiceOut = "You ordered a Sprite";
                        break;
                    
                        case "m": choiceOut = "You ordered a Mountain Dew";
                        break; 
                    
                        case "M": choiceOut = "You ordered a Mountain Dew";
                        break;
                    
                        default: choiceOut = "Invalid Selection";
                    }
                

                }
                
                //customize fries
                else if (selection.equalsIgnoreCase("F"))
                {
                    System.out.println ("Do you want a large or small order of fries?");
                    System.out.print ("     Large (l or L)\n     Small (s or S)\n::");
                    option = userInput.next();
                
                    switch (option)
                    {
                        case "s": choiceOut = "You ordered small fries.";
                        break; 
                    
                        case "S": choiceOut = "You ordered small fries.";
                        break;
                    
                        case "l": choiceOut = "You ordered large fries.";
                        break; 
                    
                        case "L": choiceOut = "You ordered large fries.";
                        break;
                    
                        default: choiceOut = "Invalid Selection";
                    }
                
                }
                
                
                //if user enterred incorrect value
                else
                {
                    System.out.println ("You did not enter any of B, b, S, s, F, or f");
                    return;
                }
            
            }
        
            
            //if more than one char
            else if (selection.length() > 1)     
            {
                System.out.println ("A single character is expected");
                return;
            }    
            
            //print order
            System.out.println (choiceOut);
        
        
        //close main method
        }    
    
    
    //close class
    }    