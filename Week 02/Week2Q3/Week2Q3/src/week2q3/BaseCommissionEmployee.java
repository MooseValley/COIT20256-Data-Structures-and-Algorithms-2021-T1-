/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2q3;

/**
 *
 * @author omalleym
 */
public class BaseCommissionEmployee //extend  BaseCommissionEmployee
{
    private CommissionEmployee emp;
    private double baseSalary;
    
    public BaseCommissionEmployee ()
    {
        //emp = new CommissionEmployee ();
        //baseSalary = 0.0;
        this("", 0.0);
    }

    public BaseCommissionEmployee (String name, double baseSalary)
    {
        emp = new CommissionEmployee ();
        
        emp.setName (name);
        this.baseSalary = baseSalary;
    }
    
    public void setName (String name)
    {
        emp.setName (name);
    }
    
    public String getName ()
    {
        return emp.getName();
    }
    
    @Override
    public String toString()
    {
        return emp.getName() + "\t" + baseSalary;
    }
}
