//Safiya Nieves
//09.24.2014
//CSE2 LAB05


//import Math class
import java.lang.Math;
import java.util.Random;

//import Scanner class
import java.util.Scanner;

    //define class
    public class RandomGames
    {
    
        //add main method
        public static void main (String [] args)
        {
            String game;
            String gameType;
            int spin = (int)(Math.random()*10000%38);
            String color = "";
            
            //calls Scanner and requests it accept input
            Scanner userInput = new Scanner (System.in);
            
            //request int from user
            System.out.print ("Enter one: \nR or r for Roulette \nC or c for craps \nP or p for pick a card \n:: ");
            game = userInput.next();
    
            switch (spin)
            {
                case 37:
                color = color + "00";
                break;
                
                default:
                color = color + spin;
                break;
            }
                
            if (game.length() > 1)
            {
                gameType = "A single character is expected";    
            }
            
            
            else
            {
                switch (game)
                {
                case "p":
                case "P": 
                gameType = "Picking a Card option is yet to be implemented";
                break;                    
                
                case "c": 
                case "C": 
                gameType = "Craps option is yet to be implemented";
                break;                      
                
                case "r": 
                case "R": 
                gameType = "Roulette: " + color;
                break;
                
                default: 
                gameType = "Please select a valid option.";
                break;
                }
            }
            
            System.out.println(gameType);
            
        }
    }    
    
    
                //if (game.equalsIgnoreCase("c"))
                //{
                //System.out.println ("Craps option is yet to be implemented");    
                //}
                
                //else if (game.equalsIgnoreCase("p"))
                //{
                //System.out.println ("Picking a card option is yet to be implemented");    
                //}
                
                //else if (game.equalsIgnoreCase("r"))
                //{
                //System.out.println ("R");    
                //}
                
                //else
                //{
                //System.out.println ("Please select valid option.");    
                //}