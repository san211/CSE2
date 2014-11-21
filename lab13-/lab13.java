//safiya nieves
//lab13
//11.19.2014

import java.util.Arrays;

//define class
public class lab13
{

public static void main(String [] arg)
{

    int j = 0;
    int i = 0;
    int k = 0;
    int min = 0;
    
    int[][] array = new int [5][];
    int[][] sort = new int[5][];
    
    for (j=0; j<5; j++)
    {
        array[j] = new int [j*3 + 5];
        sort[j] = new int [j*3 + 5];
    }
    
    for (j=0; j<5; j++)
    {
        for (i=0; i<array[j].length; i++)
        {
            array [j][i] = (int)((Math.random()*10000)%40);
            sort [j][i] = -1;
        }
    }
    
    System.out.println("\nTHE ARRAY BEFORE SORTING\n");
    for (j=0; j<5; j++)
    {
        for (i=0; i<array[j].length; i++)
        {
            System.out.print (array [j][i] + "  ");
            
            if(array[j][i] < 10)
            {System.out.print(" ");}
        }
        
        System.out.println();
    }  
  
  
    for (j=0; j<5; j++)
    {
        Arrays.sort(array[j]);    
    }
  
  
    System.out.println("\n\nTHE ARRAY AFTER SORTING\n");
    for (j=0; j<5; j++)
    {
        for (i=0; i<sort[j].length; i++)
        {
            System.out.print (array [j][i] + "  ");
            
            if(array[j][i] < 10)
            {System.out.print(" ");}
        }
        
        System.out.println();
    }  
}
}   
