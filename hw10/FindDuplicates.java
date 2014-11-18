//safiya nieves
//11.18.2014
//hw 10
//FindDuplicates

//find duplicates given user input


import java.util.Scanner;

public class FindDuplicates
{
  public static void main(String [] arg)
  {
    
    Scanner scan=new Scanner(System.in);
    
    int num[]=new int[10];
    String answer=""; //to store replay response
    
    do
    {
      System.out.print("Enter 10 ints- "); //prompt user to enter ints
      
      for(int j=0;j<10;j++) //loop to accept ints
      {num[j]=scan.nextInt();} //array num
      
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      
      //does the array have any duplicates?
      //calls hasDups
      if(hasDups(num))//boolean true
      {out+="has ";}
      else//boolean false
      {out+="does not have ";}
      out+="duplicates."; //end of statement
      
      
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      
      //does the array have only one dup?
      if(exactlyOneDup(num))
      {out+="has ";}//boolean true
      else
      {out+="does not have ";}//boolean false
      out+="exactly one duplicate.";
      System.out.println(out);
      
      //asks the user if they want to go again
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }
    while(answer.equals("Y") || answer.equals("y")); //keeps loop going if user enters y or Y
  }

  //method to print array as string 
  //out is String
  public static String listArray(int num[])
  {
    String out="{";
    for(int j=0;j<num.length;j++)
    {
      if(j>0)
      {out+=", ";} //only prints comma after num[0]
      out+=num[j];
    }
    
    out+="} ";
    return out;
  }
  
  public static Boolean hasDups (int num[])
  {
    int i = 0;//loop counters
    int j = 0;
    
    for (i=0; i<num.length; i++)
    {
      for (j=(i+1); j<num.length; j++)
        {
          if(num[i] == num [j])
          {return true;}//return value if at least one dup
        }
    }
    
    return false;
  }
  
  public static Boolean exactlyOneDup (int num[])
  {
    int i = 0;
    int j = 0;
    int dup = 0;//counter for dup
    
    for (i=0; i<num.length; i++)
    {
      for (j=(i+1); j<num.length; j++)
        {
          if(num[i] == num [j])
          {dup++;}//return value if at least one dup
        }
    }
    
    if (dup == 1)
    {return true;}//if dup = 1 then exactly one dup
    else
    {return false;}
  }
  
}
