//Safiya Nieves
//CSE 2
//lab 09
//10/21/2014

//PURPOSE
//  Create Methods
import java.util.Scanner;

public class Methods
{    


public static int getInt (Scanner z)
{
    int q;
    System.out.println ("\nint: ");

    
    while (!z.hasNextInt())
    {   
            System.out.println ("\nint: ");
            String p = z.next();
    }
    
        q = z.nextInt();
        return q;
        
}

//LARGER
public static int larger (int x, int y)
{
    if (x>y)
    {
        return x;
    }
    
    else
    {
        return y;
    }
    
}

public static boolean ascending (int i, int j, int k)
{
    if (i < j && j < k)
    {
        return true;
    }
    else
    {
        return false;
    }
    
}



    
        public static void main(String [] arg)
        {
        
            Scanner scan=new Scanner(System.in);
            int a,b,c;
            System.out.println("Enter three ints");
            a=getInt(scan);
            b=getInt(scan);
            c=getInt(scan);
            System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
            System.out.println("The larger of "+a+", "+b+", and "+c+" is "+larger(a,larger(b,c)));
            System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+", and "+c+" are in ascending order");
        
        
        
        
        }
    }