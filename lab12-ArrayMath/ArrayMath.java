//safiya nieves
//lab 12
//Array Math

//practice arrays

//import Scanner class
import java.util.Arrays;

//define class
public class ArrayMath
{
  //method equals
  //input two arrays; output boolean
  public static boolean equals(double[] x, double[] y)
  {
      boolean z = true;
      
      if (x.length == y.length)
      {
        
        for (int i = 0; i < x.length; i++)
        {
          if (x[i] != y[i]){ return false;}
        }
        
      }    
      
      else
      {z = false;}
      
      return z;
  }
  
  public static double[] addArrays(double [] k, double [] l)
  {
    int m = 0; //short
    int n = 0; //long
    if (k.length < l.length)
    {
      m = k.length;
      n = l.length;
    }
    else 
    {
      m = l.length;
      n = k.length;
    }
    
    double sum[] = new double [n];
    
    for (int i = 0; i < m; i++)
    {
      sum [i] = k[i] + l[i];
    }
    
    for (int i = m; i<k.length; i++)
    {
      sum [i] = k[i];
    }
    
    for (int i = m; i<l.length; i++)
    {
      sum [i] = l[i];
    }
    
    return sum;
      
  }
    
          
  public static void main(String [] arg)
  {
    double x[]={2.3, 3, 4, -2.1, 82, 23},
        y[]={2.3, 3, 4, -2.1, 82, 23},
        z[]={2.3, 13, 14},
        w[]={2.3, 13, 14, 12}, 
        v[],
        u[]={2.3, 12, 14};
    
    v=addArrays(x,y);
    
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));
  }
  
  //method display
  //input array; output string
  public static String display(double [] x)
  {
    String out="{";
    for(int j=0;j<x.length;j++)
    {
      if(j>0)
      {out+=", ";}
      
      out+=x[j];
    }
    
    return out+"}";
  }
}

