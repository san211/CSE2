//Safiya Nieves
//09.09.2014
//CSE2 HW02

//PURPOSE
//Compute cost of total purchase including sales tax given items purchased
//ASSUMPTIONS
//all items carry sales tax (clothes too)

//truncation error exists due to converstion from double to int
//error noticable only in total purchase cost

//create class
public class Arithmetic
{
    
    //add main method
    public static void main (String[]args)
    {
        
        //declare and define given variables
        //is part of variable name
        int nSocks=3; //number of pairs of socks
        double sockCost$=2.58; //cost per pair of socks
        
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //cost per glass
        
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        
        double taxPercent=0.06; //PA sales tax
    
        //declare and define calculated values
        //cost = nitems * cost of item
        //tax = pretax cost * tax rate
        //total item cost = tax + cost
        double sockPreTax = (nSocks * sockCost$);  //sock cost before tax
        double sockTax = sockPreTax * taxPercent; //tax on socks
        double sockTotal = sockPreTax + sockTax; //cost of all sock pairs after tax
        
        sockTax = (int)(sockTax * 100) / 100.0; //convert tax into int then multiple by 100 / 100.0 to obtain two decimal number
        
        double glassPreTax = nGlasses * glassCost$; //glass cost before tax
        double glassTax = glassPreTax * taxPercent; //tax on glasses
        double glassTotal = glassPreTax + glassTax; //cost of all glasses after tax
        
        glassTax = (int)(glassTax * 100) / 100.0; //convert tax to two decimals
        
        double envelopePreTax = nEnvelopes * envelopeCost$; //envelope cost before tax
        double envelopeTax = envelopePreTax * taxPercent; //tax on envelopes
        double envelopeTotal = envelopePreTax + envelopeTax; // cost of all envelope boxes after tax
        
        envelopeTax = (int)(envelopeTax * 100) / 100.0; //convert tax to two decimals
        
        double purchaseCost = sockTotal + glassTotal + envelopeTotal;
        
        purchaseCost = (int)(purchaseCost * 100) / 100.0;
        
        //print cost per item
        //spacing added to allow neat table that will show item number as well as cost per item
        System.out.println ("Socks              " + nSocks + "   @   $" + sockCost$ );
        System.out.println ("   Cost            $" + sockPreTax );
        System.out.println ("   Tax             $" + sockTax );
        System.out.println ("  ");//add space to separate output
        System.out.println ("Drinking Glasses   " + nGlasses + "   @   $" + glassCost$ );
        System.out.println ("   Cost            $" + glassPreTax );
        System.out.println ("   Tax             $" + glassTax );
        System.out.println ("  ");//add space to separate output
        System.out.println ("Envelopes          " + nEnvelopes + "   @   $" + envelopeCost$ );
        System.out.println ("   Cost            $" + envelopePreTax );
        System.out.println ("   Tax             $" + envelopeTax );
        System.out.println ("  ");//add space to separate output
        System.out.println ("  ");//add space to separate output        
        System.out.println ("SUBTOTAL           $" + (sockPreTax+glassPreTax+envelopePreTax) );
        System.out.println ("TAX                $" + (sockTax+glassTax+envelopeTax) );
        System.out.println ("TOTAL              $" + purchaseCost );
        
        //end
    }
}
