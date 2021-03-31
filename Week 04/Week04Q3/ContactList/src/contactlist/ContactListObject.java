/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;
import java.util.ArrayList;


/**
 *
 * @author omalleym
 */
public class ContactListObject {
    //int numContacts;
    ArrayList<ContactRecord> list = new ArrayList<ContactRecord> ();
    int current;
    
    public ContactListObject ()
    {
        //numContacts = 0;
        current = 0;
        
        list.add (new ContactRecord ("Mike",    "OMalley", "122212") );
        list.add (new ContactRecord ("Frankie", "OMalley", "332211") );
        list.add (new ContactRecord ("Bella",   "Hinton",  "445544") );
    }
    
    public ContactRecord next()
    {
        if (current >= list.size() - 1)
        {
            current = 0;
        }
        else
        {
            current++;
        }
        
        return list.get (current);
    }
    
    public ContactRecord first()
    {
        current = 0;
        
        return list.get (current);
    }
    
}
