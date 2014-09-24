//Safiya Nieves
//09.23.2014
//CSE2 HW 04
//Program 3. CourseNumber

//PURPOSE: given a course number determine the semester and year of the course


//import Scanner class
import java.util.Scanner;

    //define class
    public class CourseNumber
    {
    
        //add main method
        public static void main (String [] args)
        {
            //calls Scanner and requests it accept input
            Scanner userInput = new Scanner (System.in);
            
            //request int from user
            System.out.print ("Enter a six digit number giving the course number: ");
            
                //chk that input is integer            
                if (userInput.hasNextInt())
                {
                //assign input    
                int courseNum = userInput.nextInt();

                    //chks int > 0 and in range
                    if (courseNum<186510 | courseNum>201440)  
                    {
                    System.out.println ("The number was outside the range [186510,201440]");
                    return;
                    }
                    
                    else
                    {
                    
                    //gives semester value    
                    int semester;
                    semester = courseNum%100;
                    
                    //gives year
                    int year;
                    year = courseNum/100;
                    
                        //logic statements to determine semester
                        if (semester == 10)
                        {
                        System.out.println ("The course was offered in the Spring semester of " +year+ ".");
                        }
                        
                        else if (semester == 20)
                        {
                        System.out.println ("The course was offered in the Summer 1 semester of " +year+ ".");   
                        }

                        else if (semester == 30)
                        {
                        System.out.println ("The course was offered in the Summer 2 semester of " +year+ ".");  
                        }
                        
                        else if (semester == 40)
                        {
                        System.out.println ("The course was offered in the Fall semester of " +year+ ".");                          
                        }
                        
                        //if semester entry is invalid
                        else
                        {
                        System.out.println (semester + " is not a legitimate semester.");
                        return;
                        }
                    }
                
                    
                }
    }   } 
                
                
                