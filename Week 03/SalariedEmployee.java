/*
 Author: Mike O'Malley
 Source: SalariedEmployee.java
Descrtn: TBA ... :)

Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 23-Mar-2021 Mike O    Created.

*/
public class SalariedEmployee  extends Employee implements Comparable, Payable
{
	private double weeklySalary;

   // Default Consructor:
   public SalariedEmployee ()
   {
		this("", "", "", 0); // Call Parameterised Consructor
   }

   // Parameterised Consructor:
   public SalariedEmployee (String firstName, String lastName, String socialSecurityNumber,
                            double weeklySalary)
   {
		// Call Employee constructor
		super(firstName, lastName, socialSecurityNumber);

		this.weeklySalary = weeklySalary;
   }

   // Accessors / Getters:

   public double getWeeklySalary ()
   {
      return weeklySalary;
   }

   // Mutators / Setters:

   public void setWeeklySalary (double weeklySalary)
   {
      this.weeklySalary = weeklySalary;
   }


   @Override
   public String toString ()
   {
      return super.toString() +
         " " + weeklySalary;
   }


   @Override
   public double getPaymentAmount()
   {
	   return weeklySalary;
   }

   @Override
   public int compareTo (Object obj2)
   {
	   int result = super.compareTo (obj2);

	   if (result == 0)
	   {
		   if (obj2 instanceof SalariedEmployee)
		   {
			   SalariedEmployee emp2 = (SalariedEmployee) obj2;

			   if (weeklySalary < emp2.getPaymentAmount() )
				  result = -1;
			   else if (weeklySalary == emp2.getPaymentAmount() )
				  result = 0;
			   else
				  result = 1;
		   }
		   else
		   {
			  result = -1; // Not same data type.
		   }
	   }

	   return result;
   }


} // public class SalariedEmployee
