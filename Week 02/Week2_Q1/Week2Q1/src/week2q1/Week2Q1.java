/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2q1;

import java.util.ArrayList;


/**
 *
 * @author omalleym
 */
public class Week2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehicle v1 = new Vehicle ();
        
        v1.setDescription         ("Toyota");
        v1.setBuildYearMonth      ("2021-Jan");
        v1.setFuelEconomyPerLitre (5.3);
        
        Car c1 = new Car ();
        c1.setDescription         ("Ford");
        c1.setBuildYearMonth      ("2001-Feb");
        c1.setFuelEconomyPerLitre (3.3);
        c1.setMaxPassengers       (4);

        //System.out.println (v1.toString() );
        System.out.println (v1 );
        System.out.println (c1 );
        
        Vehicle[] vehicles = new Vehicle [5];
        
        vehicles[0] = v1;
        vehicles[1] = new Car();
        
        vehicles[1].setDescription         ("Porche");
        vehicles[1].setBuildYearMonth      ("2018-Dec");
        vehicles[1].setFuelEconomyPerLitre (4.8);
        
        if (vehicles[1] instanceof Car)
        {
            ((Car) vehicles[1]).setMaxPassengers       (2);
        }
        

        vehicles[2] = new Vehicle ("Camry",    "2011-Jan", 9.9);
        vehicles[3] = new Car     ("Honda",    "2012-Sep", 9.5, 4);
        vehicles[4] = new Truck   ("Kenworth", "2013-Aug", 1.2, 20.5);

        for (int k = 0; k < vehicles.length; k++)
        {
            System.out.println (vehicles [k] );
        }
        
        
        ArrayList<Vehicle> vehiclesArrayList = new ArrayList<Vehicle> ();
        
        // add, get, size
        
        vehiclesArrayList.add (new Vehicle ("Camry",    "2011-Jan", 9.9) );
        vehiclesArrayList.add (new Car     ("Honda",    "2012-Sep", 9.5, 4) );
        vehiclesArrayList.add (new Truck   ("Kenworth", "2013-Aug", 1.2, 20.5) );
        
        for (int k = 0; k < vehiclesArrayList.size(); k++)
        {
            System.out.println (vehiclesArrayList.get (k) );
        }


        for (Vehicle v : vehiclesArrayList)
        {
            System.out.println (v );
        }
        
        
        // Total up the passengers for all Cars
        // loop through all vevicles in array
        // is it a car ?  Add passengers onto total
        // display total after loop

        int totalPass = 0;
        
        for (int k = 0; k < vehicles.length; k++)
        {
            if (vehicles[k] instanceof Car)
            {
                totalPass += ((Car) vehicles[k]).getMaxPassengers ();
            }
        }

        
        for (Vehicle v : vehiclesArrayList)
        {
            if (v instanceof Car)
            {
                totalPass += ((Car) v).getMaxPassengers ();
            }
        }

        System.out.println ("Total passengers: " + totalPass );


    }
    
}
