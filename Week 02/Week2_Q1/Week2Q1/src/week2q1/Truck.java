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
public class Truck extends Vehicle
{
    private double loadingCapacityTons;
    
    public Truck()
    {
        super();
        loadingCapacityTons = 0.0;
    }
    
    public Truck(String description, String buildYearMonth, double fuelEconomyPerLitre, double loadingCapacityTons) 
    {
        super(description, buildYearMonth, fuelEconomyPerLitre);
                
        this.loadingCapacityTons = loadingCapacityTons;
    }

    public double getLoadingCapacityTons ()
    {
        return loadingCapacityTons;
    }

    public void setLoadingCapacityTons (double loadingCapacityTons)
    {
        this.loadingCapacityTons = loadingCapacityTons;
    }
 
    @Override
    public String toString()
    {
        return  super.toString() + "\t" +
                loadingCapacityTons;
    }
    
} // public class Truck 
