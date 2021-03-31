/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

/**
 *
 * @author omalleym
 */
public class ContactRecord {
    String firstName;
    String lastName;
    String phoneNumber;
    
    public ContactRecord ()
    {
        this ("", "", "");
    }

    public ContactRecord (String firstName, String lastName, String phoneNumber)
    {
        this.firstName   = firstName;
        this.lastName    = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName()
    {
        return firstName;
    } 
    
    public String getLastName()
    {
        return lastName;
    } 

    public String getPhoneNumber()
    {
        return phoneNumber;
    } 

    public void setFirstName (String firstName)
    {
        this.firstName   = firstName;
    }

    public void setLastName (String lastName)
    {
        this.lastName   = lastName;
    }

    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber   = phoneNumber;
    }

    @Override
    public String toString()
    {
        return firstName + "\t" + lastName + "\n" + phoneNumber;
    }
}
