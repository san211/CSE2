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
            
            //intialize variables
            //counters
            int i=0;
            int j=0;
            
            //for each 100 spins counters for number of spins won and lost
            //reset after 100 spins
            int win = 0;
            int lose = 0;           
            
            //counts if 100 spin session was profitable
            //does not reset
            int trialWin=0;
            int trialFail=0;
            int trialOther=0;
            
            //count totals losses and wins for all spins
            //does not reset
            int winCount=0;
            int lossCount=0;
        
            //1000 trials
            while (j<1000)
            {   
                win=0;
                lose=0;
                i=0;
                bet = (int)((Math.random()*10000))%38; //random bet
                
                //100 spins
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    