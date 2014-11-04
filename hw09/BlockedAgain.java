//Safiya Nieves
//CSE 2
//hw 09
//11/04/2014

//PURPOSE
//  Print a pattern for the user

import java.util.Scanner;

public class BlockedAgain 
{
    //checks if input is int
    public static int checkInt(Scanner entry) 
    {
        int x;
        int y;
        String q;

        while (!entry.hasNextInt()) 
        {
            System.out.println("You did not enter an int; try again: ");
            q = entry.next(); //takes trash
        }

        y = checkRange(entry);
        return y;
    }

    //check if input is in range
    public static int checkRange(Scanner entry) 
    {
        int q = entry.nextInt();
        int x;

        while (q > 9 || q < 1) 
        {
            System.out.println("You did not enter an int in [1,,9]; try again: ");
            
            if (entry.hasNextInt()) 
            {q = entry.nextInt();}

            else 
            {checkInt(entry);}
        }

        return q;
    }

    //request input from the user
    //getInc calls checkInt and checkRange
    public static int getInt() 
    {
        Scanner userInput = new Scanner(System.in);
        int entry;
        System.out.println("Enter an int between 1 and 9, inclusive: ");
        entry = checkInt(userInput); //chk for int
        return entry;
    }

    //numbers and indent of blocks
    public static void line (int j)
    {
        while (j > 0) 
        {
            System.out.print(" ");
            j--;
        }                
    }
     
    //calls line()
    //lines are all the same size
    public static void block (int i)
    {
        int k = 0;
        while (k < (i * 2) - 1) 
        {
            System.out.print(i);
            k++;
        }        
    }

    //calls block ()
    public static void allBlocks(int x) 
    {
        int i = 1;
        int m;
        int j;
        int k;
        String z = "";
        
        while (i <= x) 
        {
            m = 1;
            
            while (m <= i) 
            {
                j = (x - i);
                line (j);
                block(i);
                System.out.println();
                m++;
            }

            j = (x - i);
            line (j);

            k = 0;
            while (k < (i * 2) - 1) 
            {
                System.out.print("-");
                k++;
            }

            System.out.println();
            i++;
        }
    }

    public static void main(String[] s) 
    {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }
}
