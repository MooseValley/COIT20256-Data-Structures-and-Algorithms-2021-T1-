/*
 Author: Mike O'Malley
 Source: Employee.java
Descrtn: TBA ... :)

Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 23-Mar-2021 Mike O    Created.

*/

/*

9.10 (Write a Line of Code) Write a line of code that performs each of the following tasks:
a) Specify that class PieceWorker inherits from class Employee.
b) Call superclass Employee’s toString method from subclass PieceWorker’s toString
method.
c) Call superclass Employee’s constructor from subclass PieceWorker’s constructor—assume
that the superclass constructor receives three Strings representing the first name,
last name and social security number.
9.11 (Using super in a Constructor’s Body) Explain

9.15 (Creating a New Subclass of Employee) Other types of Employees might include Salaried-
Employees who get paid a fixed weekly salary, PieceWorkers who get paid by the number of pieces
they produce or HourlyEmployees who get paid an hourly wage with time-and-a-half—1.5 times the
hourly wage—for hours worked over 40 hours.
Create class HourlyEmployee that inherits from class Employee (Exercise 9.14) and has
instance variable hours (a double) that represents the hours worked, instance variable wage (a double)
that represents the wages per hour, a constructor that takes as arguments a first name, a last
name, a social security number, an hourly wage and the number of hours worked, set and get methods
for manipulating the hours and wage, an earnings method to calculate an HourlyEmployee’s
earnings based on the hours worked and a toString method that returns the HourlyEmployee’s
String representation. Method setWage should ensure that wage is nonnegative, and setHours
should ensure that the value of hours is between 0 and 168 (the total number of hours in a week).
Use class HourlyEmployee in a test program that’s similar to the one in Fig. 9.5.

10.14 (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include an
additional Employee subclass PieceWorker that represents an employee whose pay is based on the
number of pieces of merchandise produced. Class PieceWorker should contain private instance
variables wage (to store the employee’s wage per piece) and pieces (to store the number of pieces
produced). Provide a concrete implementation of method earnings in class PieceWorker that calculates
the employee’s earnings by multiplying the number of pieces produced by the wage per
piece. Create an array of Employee variables to store references to objects of each concrete class in
the new Employee hierarchy. For each Employee, display its String representation and earnings.
440 Chapter 10 Object-Oriented Programming: Polymorphism and Interfaces

10.15 (Accounts Payable System Modification) In this exercise, we modify the accounts payable
application of Figs. 10.11–10.15 to include the complete functionality of the payroll application of
Figs. 10.4–10.9. The application should still process two Invoice objects, but now should process
one object of each of the four Employee subclasses. If the object currently being processed is a Base-
PlusCommissionEmployee, the application should increase the BasePlusCommissionEmployee’s base
salary by 10%. Finally, the application should output the payment amount for each object. Complete
the following steps to create the new application:
a) Modify classes HourlyEmployee (Fig. 10.6) and CommissionEmployee (Fig. 10.7) to place
them in the Payable hierarchy as subclasses of the version of Employee (Fig. 10.13) that
implements Payable. [Hint: Change the name of method earnings to getPaymentAmount
in each subclass so that the class satisfies its inherited contract with interface Payable.]
b) Modify class BasePlusCommissionEmployee (Fig. 10.8) such that it extends the version
of class CommissionEmployee created in part (a).
c) Modify PayableInterfaceTest (Fig. 10.15) to polymorphically process two Invoices,
one SalariedEmployee, one HourlyEmployee, one CommissionEmployee and one Base-
PlusCommissionEmployee. First output a String representation of each Payable object.
Next, if an object is a BasePlusCommissionEmployee, increase its base salary by 10%. Finally,
output the payment amount for each Payable object.
10.16 (Accounts Payable System Modification) It’s possible to include the functionality of the payroll
application (Figs. 10.4–10.9) in the accounts payable application without modifying Employee
subclasses SalariedEmployee, HourlyEmployee, CommissionEmployee or BasePlusCommission-
Employee. To do so, you can modify class Employee (Fig. 10.4) to implement interface Payable and
declare method getPaymentAmount to invoke method earnings. Method getPaymentAmount would
then be inherited by the subclasses in the Employee hierarchy. When getPaymentAmount is called for
a particular subclass object, it polymorphically invokes the appropriate earnings method for that
subclass. Reimplement Exercise 10.15 using the original Employee hierarchy from the payroll application
of Figs. 10.4–10.9. Modify class Employee as described in this exercise, and do not modify any
of class Employee’s subclasses.

*/

public abstract class Employee implements Comparable, Payable
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	// Default Constructor
	public Employee ()
	{
		this ("", "", "");
	}

	// Parameterised Constructor:
	public Employee (String firstName, String lastName, String socialSecurityNumber)
	{
		this.firstName = firstName;
		this.lastName  = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// Accessors
	public String getFirstName ()
	{
		return firstName;
	}

	public String getLastName ()
	{
		return lastName;
	}

	public String getSocialSecurityNumber ()
	{
		return socialSecurityNumber;
	}


	// Mutators
	public void setFirstName (String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName (String lastName)
	{
		this.lastName  = lastName;
	}

	public void setSocialSecurityNumber (String socialSecurityNumber)
	{
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString()
	{
		return  getClass().getName() + "\t" +
		        firstName + " " + lastName + " (" +
				socialSecurityNumber + ")";
	}

   @Override
   public int compareTo (Object obj2)
   {
	   int result = 0;

	   if (obj2 == null)
	   {
	      result = -1;  // Not equal.
	   }

	   else if (obj2 instanceof Employee)
	   {
		   Employee emp2 = (Employee) obj2;

			result = firstName.compareTo (emp2.getFirstName ());

			if (result == 0)
			{
				result = lastName.compareTo (emp2.getLastName ());
			}

			if (result == 0)
			{
				result = socialSecurityNumber.compareTo (emp2.getSocialSecurityNumber ());
			}

	   }

	   else
	   {
	      result = -1;  // Not equal.
	   }

	   return result;
   }

} // public abstract class Employee
