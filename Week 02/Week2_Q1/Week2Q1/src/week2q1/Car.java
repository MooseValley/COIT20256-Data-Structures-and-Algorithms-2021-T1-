    //Linked Lists, Stacks, Queues, 
            //int  Integer
            //boolean Boolean
            //char Character

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2q1;

/**
 *
 * @author omalleym
 */
public class Car extends Vehicle
{
    private int maxPassengers;
    
    public Car ()
    {
        super();
        maxPassengers = 0;
    }

    public Car (String description, String buildYearMonth, double fuelEconomyPerLitre, int maxPassengers) 
    {
        super(description, buildYearMonth, fuelEconomyPerLitre);
                
        this.maxPassengers = maxPassengers;
    }
    
    // Accessor
    public int getMaxPassengers ()
    {
        return maxPassengers;
    }
    
    public void setMaxPassengers (int maxPassengers)
    {
        this.maxPassengers = maxPassengers;
    }
    
    @Override
    public String toString()
    {
        return  super.toString() + "\t" +
                maxPassengers;
    }

} // public class Car
