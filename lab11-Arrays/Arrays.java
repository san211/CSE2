//safiya nieves
//lab 11
//arrays

//practice arrays

//import Scanner class
import java.util.Scanner;

    //define class
    public class Arrays
    {
        
        //add main method
        public static void main (String [] args)
        {
            //counters
            int i = 0;
            int j = 0;
            
            int arraySum; //sum array
            int max; //max array
            int min; //min array
            
            //arrays
            int [] array1 = new int [10]; //user input
            int [] array2 = new int [10]; //reverse?           
            
            Scanner userInput = new Scanner (System.in);
            
            System.out.println ("Enter 10 ints \n \n");
            
            for (i = 0; i <10; i++)
            {
                System.out.print ("int " + i + ": ");
                array1 [i] = userInput.nextInt();
            }
    
            //sort to find max/min
            max = array1[0];
            min = array1[0];
            
            for (i = 0; i<array1.length; i++)
            {
                if (array1[i] > max)
                {
                    max = array1[i];
                }
                
                if (array1[i] < min)
                {
                    min = array1[i];
                }
            }
            
            System.out.println("\n \nThe lowest entry is " + min);
            System.out.println("The highest entry is " + max + "\n");
            
            //print array foward and back
            i=0; 
            j=9; 
            while (i < 10 & j > -1)
            {
                System.out.println(array1[i] + "     " + array1 [j]);
                
                i++;
                j--;
            }
            
        }    
    }
