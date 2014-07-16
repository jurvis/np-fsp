import java.util.Scanner;

public class Chap5Q10 {
   public static void main(String[] args) {
      //Declare scanner object and variables
      Scanner s = new Scanner(System.in);
      int nric, a, b, c, d, e, f, g, sum = 0, result, nriccopy;
      char grade;

      //request for NRIC
      System.out.print("Enter your NRIC without alphabets: ");
      nric = s.nextInt();
      nriccopy = nric;

      //separate digits of the number
      a = nric / 1000000;
      nric -= (a * 1000000);

      b = nric / 100000;
      nric -= (b * 100000);

      c = nric / 10000;
      nric -= (c * 10000);

      d = nric / 1000;
      nric -= (d * 1000);

      e = nric / 100;
      nric -= (e * 100);

      f = nric / 10;
      nric -= (f * 10);

      g = nric;

      //Multiply by weights
      sum += (a * 2);
      sum += (b * 7);
      sum += (c * 6);
      sum += (d * 5);
      sum += (e * 4);
      sum += (f * 3);
      sum += (g * 2);
      
      //Calculate result
      result = 11 - (sum % 11);
      
      //Get check digit from result
      switch (result) {
         case 1: grade = 'A'; break;
         case 2: grade = 'B'; break;
         case 3: grade = 'C'; break;
         case 4: grade = 'D'; break;
         case 5: grade = 'E'; break;
         case 6: grade = 'F'; break;
         case 7: grade = 'G'; break;
         case 8: grade = 'H'; break;
         case 9: grade = 'I'; break;
         case 10: grade = 'Z'; break;
         case 11: grade = 'J'; break;
         default: grade = 'O';
      }
      
      System.out.println("The check digit of " + nriccopy + " is " + grade);
   }
}
