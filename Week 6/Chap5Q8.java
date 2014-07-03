import java.util.Scanner;

public class Chap5Q8 {
   public static void main(String[] args) {
      // declare scanner object
      Scanner s = new Scanner(System.in);
      // declare variables
      int count = 0, mark, pass = 0, a = 0, b = 0, c = 0, d = 0, f = 0;

      while (count < 10) {
         System.out.printf("Enter the marks of Student %d: ", count + 1);
         count++;

         mark = s.nextInt();
         // compute if student passed
         if (mark >= 50) {
            pass++;
         }

         // compute grade of student
         if (mark >= 80) {
            a++;
         } else if (mark >= 70) {
            b++;
         }
         else if (mark >= 60) {
            c++;
         } 
         else if (mark >= 50) {
            d++;
         } 
         else if (mark >= 0) {
            f++;
         }
      }

      // print statements
      System.out.printf("%d students passed.\n", pass);
      System.out.printf("%d scored A, %d scored B, %d scored C, %d scored D, %d scored F.", a, b, c, d, f);
}
}
