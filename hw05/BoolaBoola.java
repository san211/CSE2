//Safiya Nieves
//09.30.2014
//CSE2 HW 05
//Program 21. Boola Boola

//PURPOSE: Play a game!

//import Scanner class
import java.util.Scanner;


    //define class
    public class BoolaBoola
    {
        
        //add main method
        public static void main (String [] args)
        {
            //calls Scanner and requests it accept input
            Scanner userInput = new Scanner (System.in);
            
            //variable declaration
            boolean a;
            boolean b;
            boolean c;
            
            //to be used in logic statements
            String x = "";
            String question = "";
            boolean problem = true;
            String answer;
            
            //assign variables random numbers
            
            //number divided by two will have only remainder 1 or 0. 
            int q1 = (int)((Math.random()*10))%2;
            int q2 = (int)((Math.random()*10))%2;
            int q3 = (int)((Math.random()*10))%2;
            
            //number divided by 4 will have only remainder 0,1,2,3.  
            //multiply by 100 to provide equal chance of all outcomes
            int q4 = (int)((Math.random()*100))%4;
            
            //assign boolean values to variables
            if (q1==1)
            {a = true;}
            else
            {a = false;}
        
            if (q2==1)
            {b = true;}
            else
            {b = false;}
        
            if (q3==1)
            {c = true;}
            else
            {c = false;}

            //determine problem statement
            switch (q4)
            {
                case 0: question = "Does " + a + " && " + b + " && " + c + " have the value true (t/T) or false (f/F): ";
                        problem = a && b && c;
                        break;
                    
                case 1: question = "Does " + a + " || " + b + " || " + c + " have the value true (t/T) or false (f/F): ";
                        problem = a || b || c;
                        break;
                        
                case 2: question = "Does " + a + " && " + b + " || " + c + " have the value true (t/T) or false (f/F): ";
                        problem = a && b || c;
                        break;        
                            
                case 3: question = "Does " + a + " || " + b + " && " + c + " have the value true (t/T) or false (f/F): ";
                        problem = a || b && c;
                        break;
            }            
                
            //print problem statement    
            System.out.print (question);
            
            //accept user input
            answer = userInput.next(); 
            
            //if user answers T or F or invalid entry
            if (answer.equalsIgnoreCase("T"))
            {    
                if (problem==true)
                {x = "Correct";}    
                else
                {x = "Try Again";}
            }
            
            else if (answer.equalsIgnoreCase("F"))
            {
                if (problem==false)
                {x = "Correct";}    
                else
                {x = "Try Again";}
            }
            
            else
            {
                System.out.println ("Please use a valid entry (f/F/t/T)");    
                return;
            }
            
                
            //print answer
            System.out.println (x);
            
        }
    }