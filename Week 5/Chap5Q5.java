import java.util.Scanner;
public class Chap5Q5
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int year;
      while (true) {
         System.out.print("Enter year: ");
         year = input.nextInt();
         if (year<0) {
            System.out.println(year + " is an invalid year.");
         } else if ((year%400==0) || (year%4==0 && year%100!=0)) {
            System.out.print(year + " is a leap year.");
            break;
         } else {
            System.out.print(year + " is not a leap year");
            break;
         }
      }
   }
}
