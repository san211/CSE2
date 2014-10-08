//Safiya Nieves
//LAB 07
//10-08-2014


import java.util.Scanner;

public class LoopTheLoop
{
    
  public static void main(String arg [])
  {
    int nStars = 10;
    String star = "*";
    int i = 0;
    int j = 0;
    
    Scanner userInput=new Scanner(System.in);
    
    System.out.print ("Enter an int between 1 and 15: ");

    if (userInput.hasNextInt())
    {
        int input = userInput.nextInt();
        
        if (input > 0 && input < 16 )
        
        {
            i = 0;
    
            while (i<input)
            {
            System.out.print (star);
            i++;
            
            j=1;
            
            while (j<i)
            {
            System.out.print (star);
            j++;
            
            }
            
            System.out.println ();
        }
        }
        
        else
        {
            System.out.println ("your entry was not within the requested range.");
            return;
        }
    }

    

        System.out.println();
        System.out.println();


    i = 0;    
            
        while (i<nStars)
        {
            System.out.print (star);
            i++;
        }    
            
        System.out.println();
        System.out.println();
            
            
            
        i = 0;
    
        while (i<nStars)
        {
            System.out.print (star);
            i++;
            
            j=1;
            
            while (j<i)
            {
            System.out.print (star);
            j++;
            
            }
            
            System.out.println ();
        }



            
    
    
  }
}