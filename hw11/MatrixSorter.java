//Safiya Nieves
//cse 2
//hw 11
//program 2/2


import java.util.Random;
import java.util.Arrays;





public class MatrixSorter{
  
  //build 3d jagged array
  public static int[][][] buildMat3d ()
  {
   
    int [][][] array = new int [3][][];
    
    int i = 0;
    int j = 0;
    int k = 0;
    
    for (k=0; k<3; k++)
    {  
      array[k] = new int [3+2*k][];
       
      for (j=0; j<array[k].length; j++)
      {
        array [k][j] = new int [k+j+1];
      }    
    }    
        
    
    for (k=0; k<3; k++)
    {
        for (j=0; j<array[k].length; j++)
        {
            for (i=0; i<k+j+1; i++)
            {
              array[k][j][i] = (int)((Math.random()*10000)%100)+1;  
            }
        }
    }
    
    return array;
  }
  
  //print array
  public static void show(int[][][] array)
  {
    int k = 0;
    int j = 0;
    int i = 0;
    
    for (k=0; k<3; k++)
    {
      System.out.println("-------------------------- SLAB " + (k+1));
      
      for (j=0; j<array[k].length; j++)
      {
        for (i=0; i<array[k][j].length; i++)
        {
          System.out.print(array[k][j][i] + " ");
          
          if(array[k][j][i] < 10)
          {System.out.print(" ");}
        }
        
        System.out.println();
      }
    } 
  }
  
  //find smallest entry
  public static int findMin(int[][][] array)
  {
    int k = 0;
    int j = 0;
    int i = 0;
    
    int min = array[k][j][i];
    
    for (k=0; k<3; k++)
    {
      for (j=0; j<array[k].length; j++)
      {
        for (i=0; i<k+j+1; i++)
        {
          if (array[k][j][i] < min)
          {min = array[k][j][i];}
        }
      }
    } 
    
    return min;
  }
  
  //sort rows
  public static void sort (int[][] array)
  {
    int i = 0;
    int j = 0;
    
    int m = 0;
    
    int min1 = 0;
    int min2 = 0;
    int index = 0;
  
    for(j=0; j<7; j++)      
    for (i=0; i < array[j].length - 1; i++)
    {
      min1 = array[j][i];
      index = i;
      
      for (m=i+1; m < array[j].length; m++)
      {
        if (min1 > array[j][m])
        {
          min1 = array[j][m];
          index = m;
        }
      }      
      
      if (index != i)
      {
        array[j][index] = array[j][i];
        array[j][i] = min1;
      }
    }
    
    for (j = 1; j < array.length; j++) 
    {
      min2 = array[j][0];
    
      for (m = j-1; m >= 0 && array[m][0] > min2; m--) 
      {
        array[m+1] = array[m];
      }

      array[m+1][0] = min2;
    }
    
    
  }
  
  public static void main(String arg[])
  {
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
  }
}
