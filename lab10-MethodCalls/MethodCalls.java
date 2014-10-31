//Safiya Nieves
//CSE 2
//lab 10
//10/29/2014

//PURPOSE
//  Create Methods


public class MethodCalls
{
    
    //expects that ‘digit’ is an int between 0 and 9, 
    //inclusive, and it returns an int whose value is  ‘number’ with digit preceding it.  
    //If digit is not between 0 and 9, then addDigit() should simply return number
    public static int addDigit(int y, int x)
    {
        String q = "";
        int z;
        
        if ( (x>=0 & x<=9) & (y>0) )
        {
            q = q + x + y;            
        }
        
        
        else if ((x>=0 & x<=9) & (y<=0) )
        {
            x = Math.abs(x);
            y = Math.abs(y);
            q = "-" + x + y;
        }
        
        //return number if int is not between 1 and 9
        else if (x>9 || x<0)
        {
            q = q + y;
        }

        z = Integer.valueOf(q);
        return z;

    }
    
    //returns an int whose value consists of the values of the two input parameters “pasted together.” 
    public static int join (int s, int t)
    {
        int p;
        String k = "";
        
        if ( Math.abs(s) > 9 || Math.abs(t) > 9 )
        {
            s = Math.abs(s);
            t = Math.abs(t);
            k = k + s + t;
            p = Integer.valueOf(k);
        }
        
        else
        {
            p = addDigit(s,t);
        }
        
        return p;
        
    }
    
    public static void main(String []  arg)
    {
        int a=784,b=22,c;
        
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        
        c=join(a,b);
        
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
        
        
/*Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
    }
}  
