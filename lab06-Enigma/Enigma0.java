/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    
    int k=4,p=6,q=7,r=8,n=0;
        
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    

      System.out.println("sum is 25");
      System.out.println("To repeat, you entered "+n);

  }
}

/* Error report:
 *   Expand this comment:
 
        error: variable n might not have been initialized
        System.out.println("To repeat, you entered "+n);
                                                     ^
        1 error
        
        Compilation Error
            LINE 22
            Variable n was declared but not initialized in outer scope
            Initialization in inner scope does not provide initialization in outer scope
            
        Logic Error
            Switch statement is unecessary.  
            
        Correction
            Moved variable declaration to higher line
            This allowed me to assigned dummy value of n=0.
            removed declaration from if/else statement
            After if/else n will be assigned an actual value.
            This will print the int entered by the user
            
            Removed switch statement 
            


 */

