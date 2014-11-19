//safiya nieves
//cse 2 hw 10
//11.18.2014
//program 2 PokerOdds

import java.util.Random;
import java.util.Scanner;

public class PokerOdds
{
  
  public static void main(String [] arg)
  {
    //generate poker hands prompting the user if they would like another hand  
    showHands(); 
    
    //randomly generate 10000 hands
    //count number of times that a hand with a pair of specific rank occurs
    //count number of times there is no pair
    simulateOdds(); 
  
  }

  public static void showHands()
  {
    Scanner input =new Scanner(System.in);
    
    int [] cards = new int [52]; //declare array for cards
    int hand[] = {-1, -1, -1, -1, -1};//hand of empty cards
    
    String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};//assign suits
    String rank[] = {"A ", "K ", "Q ", "J ", "10", "9 ", "8 ", "7 ", "6 ", "5 ", "4 ", "3 ", "2 "};//assign ranks
    
    int i = 0; //counter
    int deal = 0;//deal of card
    
    String replay = "";

    do//needs to run at least once
    {
      //unused deck of cards
      for (i=0; i<52; i++)
      {cards[i]=i;}
    
      i=0; //start counter for while loop
      while (i<5)//draw 5 cards
      {
        deal = (int)(Math.random()*10000)%52; //deal a random number btwn 0-51
        hand[i] = cards[deal]; //assign my hand that number
        cards[deal] = -1; //returns -1 to missing card
      
        //only increment if card is not -1
        //if card is -1 then card has already been dealt so no increment, loop must run again.
        if (hand[i]!=-1) 
        {i++;}
      }
      
      System.out.print("Clubs:    ");//print clubs
      for (i=0; i<5; i++)
      {
        if ((int)(hand[i])/13 == 0)
        {
          System.out.print(rank[(hand[i]%13)]);//print value
          System.out.print(" ");
        }
      }
      
      System.out.print("\nDiamonds: ");//print diamonds
      for (i=0; i<5; i++)
      {
        if ((int)(hand[i])/13 == 1)
        {
          System.out.print(rank[(hand[i]%13)]);
          System.out.print(" ");
        }
      }
      
      System.out.print("\nHearts:   ");//print hearts
      for (i=0; i<5; i++)
      {
        if ((int)(hand[i])/13 == 2)
        {
          System.out.print(rank[(hand[i]%13)]);
          System.out.print(" ");
        }
      }
      
      System.out.print("\nSpades:   ");//print spades
      for (i=0; i<5; i++)
      {
        if ((int)(hand[i])/13 == 3)
        {
          System.out.print(rank[(hand[i]%13)]);
          System.out.print(" ");
        }
      }
      
      System.out.print("\n \nWould you like another go? (Y/y ; anything else to quit): ");
      replay = input.next();
      System.out.println();

    }
    while (replay.equals("Y") || replay.equals("y"));//anything else to quit
  }


  public static void simulateOdds()
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int dup = 0;
    int noDup = 0;
    int rankCount = 0;
    int deal = 0;
    
    int [] cards = new int [52]; //declare array for cards
    int hand[] = {-1, -1, -1, -1, -1};//hand of empty cards
    String rank[] = {"A ", "K ", "Q ", "J ", "10", "9 ", "8 ", "7 ", "6 ", "5 ", "4 ", "3 ", "2 "};//assign ranks
    int countPair [] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
    
      for(k=0; k<10000; k++)//run 10000 times
      {
        dup=0;
        //unused deck of cards
        for (i=0; i<52; i++)
        {cards[i]=i;}
    
        for (i=0; i<5;)//draw 5 cards
        {
          deal = (int)(Math.random()*10000)%52; //deal a random number btwn 0-51
          hand[i] = cards[deal]; //assign my hand that number
          cards[deal] = -1; //returns -1 to missing card
      
          //only increment if card is not -1
          //if card is -1 then card has already been dealt so no increment, loop must run again.
          if (hand[i]!=-1) 
          {i++;}
        }
        
        //chk for dups
        for (i=0; i<5; i++)
        {
          for (j=(i+1); j<5; j++)
          {
            if((hand[i])%13 == (hand[j])%13)//chk if rank is equal not considering suits
            {
              dup++;
              rankCount = (int)(hand[i]%13); //place holder for face value of pair
            }
          }  
        }
        
        if (dup == 1)//if exactly one dup
        {countPair[rankCount] = countPair[rankCount] + 1;}//add to array
        else
        {noDup++;}
      }
    
      System.out.println("RANK FREQ ONE PAIR");
      for (i=0; i<13; i++)
      {
        System.out.println(" " + rank[i] + "    " + countPair[i]);
      }
      
      System.out.println("-----------------");
      System.out.println("Total Not Exactly One Pair: " + noDup);
  }
}

