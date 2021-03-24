/*
 Author: Mike O'Malley
 Source: PieceWorker.java
Descrtn: TBA ... :)

Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 23-Mar-2021 Mike O    Created.

*/
public class PieceWorker extends Employee implements Comparable, Payable
{

   // Class Data:
   private int     piecesProduced;
   private double  payRatePerPiece;

   // Default Consructor:
   public PieceWorker ()
   {
      this ("", "", "", 0, 0.0);
   }

   // Parameterised Consructor:
   public PieceWorker (String firstName, String lastName, String socialSecurityNumber,
                       int piecesProduced, double payRatePerPiece)
   {
		// Call Employee constructor
		super(firstName, lastName, socialSecurityNumber);

      this.piecesProduced  = piecesProduced;
      this.payRatePerPiece = payRatePerPiece;
   }

   // Accessors / Getters:

   public int getPiecesProduced ()
   {
      return piecesProduced;
   }

   public double getPayRatePerPiece ()
   {
      return payRatePerPiece;
   }

   // Mutators / Setters:

   public void setPiecesProduced (int piecesProduced)
   {
      this.piecesProduced = piecesProduced;
   }

   public void setPayRatePerPiece (double payRatePerPiece)
   {
      this.payRatePerPiece = payRatePerPiece;
   }

   @Override
   public String toString ()
   {
      return
         super.toString() + "\t" +
         piecesProduced   + "\t" +
         payRatePerPiece  + "\t" +
         "";
   }

   @Override
   public double getPaymentAmount()
   {
	   return piecesProduced * payRatePerPiece;
   }

   @Override
   public int compareTo (Object obj2)
   {
	   int result = super.compareTo (obj2);

	   if (result == 0)
	   {
		   if (obj2 instanceof PieceWorker)
		   {
			   PieceWorker emp2 = (PieceWorker) obj2;

			   if (getPaymentAmount() < emp2.getPaymentAmount() )
				  result = -1;
			   else if (getPaymentAmount() == emp2.getPaymentAmount() )
			   {
				  result = 0;
			   }
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

} // public class PieceWorker
