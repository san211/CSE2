//Safiya Nieves
//HW 06
//10.14.2014
//Program 1 Roulette

//PURPOSE: outcoms of bet on 1000 roulette games of 100 spins


    //define class
    public class Roulette
    {
        
        //add main method
        public static void main (String [] args)
        {
            
            //generate a random number
            //divide by 38 and request remainder
            //this will ensure resutls are 0-37 inclusive (38 possible outcomes)
            int spin = 0;
            int bet = 0;
            
            //counters
            int i=0;
            int j=0;
            
            int win = 0;
            int lose = 0;           
            
            int trialWin=0;
            int trialFail=0;
            int trialOther=0;
            
            int winCount=0;
            int lossCount=0;
        
            while (j<1000)
            {   
                win=0;
                lose=0;
                i=0;
                bet = (int)((Math.random()*10000))%38;
                
                while (i<100)
                {
                    spin = (int)((Math.random()*10000))%38;
      
                    if (spin == bet)
                    {
                        win++;
                        winCount++;
                    }
                    else
                    {
                        lose++;
                        lossCount++;
                    }
                    
                    i++;
                    
     
                }
                
                if (win>3)
                {
                    trialWin++;
                }
                
                else if (lose == 100)
                {
                    trialFail++;
                }

                else
                {
                    trialOther++;
                }
            
                j++;
                
            }    
            
            System.out.println("Number of profitable trials of 100 spins: " + trialWin);
            System.out.println("Number of times number never comes up: " + trialFail);
            System.out.println("Gains from all 100,000 spins: $" + winCount*36);
        }
    }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    