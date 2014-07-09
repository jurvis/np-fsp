import java.util.Scanner;
import java.lang.Math;

public class SumOf2Integers {
   public static void main(String[] args) {
      //Declare variables
      Scanner s = new Scanner(System.in);
      
      int a, b, user;
      
      a = (int)(Math.random()*100);
      b = (int)(Math.random()*100);
      
      //Ask user
      System.out.println("What is " + a + " + " + b + "?");
      user = s.nextInt();
      
      //Calculation
      if ((a + b) == user) {
         System.out.println(a + " + " + b + " = " + user + " is true");
      } else {
         System.out.println(a + " + " + b + " = " + user + " is false");
         System.out.println("The correct answer is " + (a + b));
      }
   }
}