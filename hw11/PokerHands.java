//safiya nieves
//12.05.2014
//cse2 hw 11
//program 1/2 poker hands

//purpose: write a program that allows the user to enter a hand of cards, and displays the best winning combination

//scanner class
import java.util.Scanner;
import java.util.Arrays;

//define class
public class PokerHands
{

//new deck 
public static void freshDeck(int[] deck, int[] rankFreq1, int[] rankFreq2)
{
      int i = 0;
      
      for (i=0; i<52; i++)
      {deck[i]=i;}
    
      //fresh arrays
      for (i=0; i<13; i++)
      {rankFreq1[i] = 0;}
      
      for (i=0; i<5; i++)
      {rankFreq2[i] = 0;}
}

//method provided in problem statement
//prints list of cards
//method formatted for viewing  
public static void showOneHand(int hand[])
{
  String suit[]={"Clubs:	","Diamonds: ","Hearts:   ","Spades:   "};
  String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
	
  String out="";
	
  for(int s=0;s<4;s++)
  {
    out+=suit[s];
  	  
  	for(int rank=0;rank<13;rank++)
  	  for(int card=0;card<5;card++)
        if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	
  	out+='\n';
  }
  	
  System.out.println(out);
}

//assigns face value of card
public static int askFace()
{
        int k=13;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");
        String face = input.next();
            
        switch(face)//%13
        {
            case "a": k = 0; break;
            case "k": k = 1; break;
            case "q": k = 2; break;
            case "j": k = 3; break;
            case "10": k = 4; break;
            case "9": k = 5; break;
            case "8": k = 6; break;
            case "7": k = 7; break;
            case "6": k = 8; break;
            case "5": k = 9; break;
            case "4": k = 10; break;
            case "3": k = 11; break;
            case "2": k = 12; break;
                
            default:
            System.out.println("You did not enter a valid response.");
        }
        
        return k;
}

//checks if card has already been selected
public static Boolean chkDup(int[] deck, int j, int k)
{
    Boolean valid=true; 
    
    if(deck [(j*13)+(k)] == -2)
    {
        valid = false;
        System.out.println("You already entered that card");
    }
    
    else
    {valid = true;}
    
    return valid;
}

public static void handSort(int[] hand)
{
  int i = 0;
  int j = 0;
  int min = 0;
  int index = 0;
  
  for (i=0; i < hand.length - 1; i++)
  {
      min = hand[i];
      index = i;
      
      for (j=i+1; j < hand.length; j++)
      {
          if (min > hand [j])
          {
              min = hand [j];
              index = j;
          }
      }      
          if (index != i)
          {
              hand[index] = hand[i];
              hand[i] = min;
          }
    }
}

public static void countRankFreq(int [] hand, int[] rankFreq1, int[] rankFreq2)
{
    int i = 0;
    int j = 0;
    
    for (i=0; i<5; i++)
    {
        j = (int)(hand[i]%13);
        rankFreq1[j]+=1;
    }
    
    for (i=0; i<5; i++)
    {
        for(j=0; j<13; j++)
        {
            if (rankFreq1[j] == i)
            {rankFreq2[i]+=1;}
        }
    }
}

public static void displayHand(int[] rankFreq2, int[] hand)
{
    String q = "";
    String x = "";
    
    Boolean straight = false;
    Boolean flush = false;
    
    int i = 0;
    
    int suitType[] = new int [5];
    int rankType[] = new int [5];
    int rankDiff[] = new int [4];
    
    String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
    
    System.out.println("suit");
    for(i=0; i<5; i++)
    {suitType[i]=(int)(hand[i]/13);System.out.print(suitType[i]);}
    
    for(i=0; i<4; i++)
    {
      if(suitType[i]==suitType[i+1])    
      {flush = true;}
      else
      {flush = false; break;}
      
      System.out.println("flush" + flush);
    }
    
    System.out.println("rank");
    for(i=0; i<5; i++)
    {rankType[i] = hand[i]%13; System.out.print(rankType[i]);}
    
    System.out.println("diff");
    for(i=0; i<4; i++)
    {rankDiff[i] = hand[i+1]-hand[i]; System.out.print(rankDiff[i]);}
    
    for(i=0; i<3; i++)
    {
      if(rankDiff[i]==rankDiff[i+1])
      {straight=true;}
      else
      {straight=false;}
    }
    
    for (i=0; i<5; i++)
    {
        q+=rankFreq2[i];
        
        if (i != 4)
        {q+=",";}
    }
    
    for (i=0; i<5; i++)
    {
        x+=rankType[i];
        
        if (i != 4)
        {x+=",";}
    }
    
    System.out.print(x);
    
    /*  
    if(flush=true) 
    {  
      if (x.equals("0,1,2,3,4"))
      {System.out.println("This is a Royal Flush\n");}
      
      else if(straight == true & flush == true)
      {System.out.println("This is a Straight Flush\n");}
      
      else if(x.equals("0,9,10,11,12"))
      {System.out.println("This is a Straight Flush\n");}
      
      else 
      {System.out.println("This is a Flush");}
    }
    
    else if (x.equals("0,9,10,11,12"))
    {System.out.println("This is a Straight\n");}
    
    else if (straight==true & flush==false)
    {System.out.println("This is a Straight\n");}
    
    
    
    else
    {*/
    
      switch(q)
      {
        case "11,1,0,0,1": System.out.println("This is Four-of-a-Kind\n"); break;
        case "10,2,0,1,0": System.out.println("This is Three-of-a-Kind\n"); break;
        case "10,1,2,0,0": System.out.println("This is Two Pairs\n"); break;
        case "9,3,1,0,0": System.out.println("This is One Pair\n"); break;
        case "11,0,1,1,0": System.out.println("This is a Full House\n"); break;
        case "8,5,0,0,0": System.out.println("This is High Card ");
        default: break;
      }
    //}
    
    
    
}


//main method
//calls showOneHand
public static void main(String [] arg)
{
    //variable declaration  
    int i = 0; //counters
    int j = 0;
    int k = 13;//face value of card.  need to be 13 for now so entry is invalid
    
    String replay = "";
    String suit = "";
    String face = "";
    
    //to use in methods and loops. \
    //need to be false for now so will be invalid
    //loop will cease running when entries are valid. hence invalid boolean and k
    Boolean valid = false;
    
    Scanner input =new Scanner(System.in); //input scanner
    
    int hand[] = new int [5]; //hand of cards
    int deck[] = new int [52]; //deck of cards
    
    int rankFreq1[] = new int [13]; //count frequency of ranks
    int rankFreq2[] = new int [5]; //

    
    do//do while to run at least once
    {
    
      freshDeck(deck, rankFreq1, rankFreq2);//new deck for each play

      //prompt if want to play
      System.out.print("Enter 'y' or 'Y' to enter a(nother) hand: ");
      replay = input.next();
      
      //breaks if user does not want to play.  need break up front bc do while will always run once
      if (!replay.equalsIgnoreCase("y"))
      {break;}
      
      System.out.println();
      
      i=0; //counter for while loop
      while (i<5)
      {
        
        valid = false;//set to false to run loop
        
        while(valid == false || k > 12)
        {
            System.out.println("Enter the suit 'c', 'd', 'h', or 's': ");//prompt for suit
            suit = input.next();
        
            switch(suit)
            {
                case "c": j = 0; valid = true; break;
                case "d": j = 1; valid = true; break;
                case "h": j = 2; valid = true; break;
                case "s": j = 3; valid = true; break;
            
                default:
                System.out.println("You did not enter a valid response.");
            }
            
            if (valid == true)
            {
                k = askFace();//will ask for face value of card
                if (k==13)//if entry is invalid 
                {break;}
                else
                {valid = chkDup(deck, j, k);}//chks for duplicate values
            }
            
            if (valid == true)
            {
                hand [i] = (j*13) + k; //based on suit and face value selection will assign number in array
                deck [(j*13)+(k)] = -2;//assign value in deck to -2 to simulate blank card
                i++;//will only increment if all previous steps are also run
            }
        }
        
      }    
      
      showOneHand(hand);//display hand

      handSort(hand);//sort hand
      
      countRankFreq(hand, rankFreq1, rankFreq2);//counts the freq of each face
      
      displayHand(rankFreq2,hand);
    

    } 
    while (replay.equalsIgnoreCase("y")); //runs for replay = y or Y 
    

    
    
    
    
    
    
    
    
    
    
}    
} 
    