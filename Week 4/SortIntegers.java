// This programs takes in 3 integers and re-orders them according to descending order
import java.util.Scanner;
public class SortIntegers {
	public static void main (String[] args) {
		int a, b, c, min, max, mid;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first Integer: ");
		a = input.nextInt();
		System.out.print("Enter the second integer: ");
		b = input.nextInt();
		System.out.print("Enter the third integer: ");
		c = input.nextInt();

		// check if a is more than b
		if( a > b ){
			//if yes, check if a is more than c too
 			if( a > c ){
 				// if true, max has to be a
  				max = a;
  				// check if b or c is larger
  				if( b > c ){
   					mid = b;
   					min = c;
  				}else{
   					mid = c;
   					min = b;
  				}
 			} 
 			// if a is larger than b but not c, a has to be in the middle
 			else {
  				mid = a;
  				// if b is larger than c, b will be the max
  				if( b > c ){
   					max = b;
   					min = c;
  				} else {
   					max = c;
   					min = b;
  				}
 			}
		} 
		else {
			/* if a is not more than b, check if b is more than c.
			if b is more than c too, b has to be max. */
 			if( b > c ){
  				max = b;
  				// check if a or c is bigger to determine the mid and min
  				if( a > c ){
   					mid = a;
   					min = c;
  				}else{
   					mid = c;
   					min = a;
  				}
 			}
 			// if all conditions above are not true, a is clearly the the lowest and mid is b
 			else{
  				max = c;
  				mid = b;
  				min = a;
 			}
		}
		System.out.printf("%d %d %d", max, mid, min);
	}
}
