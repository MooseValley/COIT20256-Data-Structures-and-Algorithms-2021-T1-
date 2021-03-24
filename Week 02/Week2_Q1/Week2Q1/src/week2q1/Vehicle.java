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
public class Vehicle 
{
    private String description;
    private String buildYearMonth;
    private double fuelEconomyPerLitre;
    
    
    public Vehicle()
    {
        description         = "";
        buildYearMonth      = "";
        fuelEconomyPerLitre = 0.0;
    }
    
    public Vehicle (String description, String buildYearMonth, double fuelEconomyPerLitre)
    {
        this.description         = description;
        this.buildYearMonth      = buildYearMonth;
        this.fuelEconomyPerLitre = fuelEconomyPerLitre;     // Build_Year_Month     
    }
    
    
    // Accessors / Getters
    public String getDescription ()
    {
        return description;
    }

    public String getBuildYearMonth ()
    {
        return buildYearMonth;
    }

    public double getFuelEconomyPerLitre ()
    {
        return fuelEconomyPerLitre;
    }
    
    // Mutators / Setters
    public void setDescription (String description)
    {
        this.description = description;
    }
    
    public void setBuildYearMonth (String buildYearMonth)
    {
        this.buildYearMonth = buildYearMonth;
    }

    public void setFuelEconomyPerLitre (double fuelEconomyPerLitre)
    {
        this.fuelEconomyPerLitre = fuelEconomyPerLitre;
    }
    
    @Override
    public String toString()
    {
        return description      + "\t" +
               buildYearMonth   + "\t" +
               fuelEconomyPerLitre;
    }
    
} // public class Vehicle 
