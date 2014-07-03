public class InterestCalculator
{
   public static void main(String[] args) 
   {
		// declaring variables
      double principal;
      double rate;
		int duration;
		double interest;

      // assigning values to the variables
      principal = 10000.00;	// in dollars
      rate = 10.00;				// in percent
		duration = 2;				// in years
		
		// compute the interest
      interest = principal * rate * duration;
		
      // display the output
      System.out.println ("Principal ($)  : " + principal);
      System.out.println ("Rate      (%)  : " + rate);
      System.out.println ("Duration (yrs) : " + duration);
      System.out.println ("Interest  ($)  :"  + interest);
   }
}
