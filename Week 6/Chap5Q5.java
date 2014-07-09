import java.util.Scanner;

public class Chap5Q5 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int input= -22222;
      
      
      while (input < 0) {
         System.out.print("Please enter a year: ");
         input = s.nextInt();
         if (input < 0) {
            System.out.println("Input error!");
         }
      }
      
      if (((input % 4) == 0) && ((input % 100) != 0) || ((input % 400) == 0)) {
            System.out.println(input + " is a leap year!");
         } else {
            System.out.println(input + " is not a leap year!");
         }
   }
}