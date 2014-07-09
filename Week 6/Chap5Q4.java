//This program converts Celsius to Fahrenheit from 0 - 100 C in increments of 5. It uses a while loop and prints a blank line after every five lines.
public class Chap5Q4 {
   public static void main(String[] args) {
      //Define variables
      int celsius = 0, count = 0;
      
      //Print column heading
      System.out.printf("%-7s  %-10s", "Celsius", "Fahrenheit");
      System.out.println("");
      
      //While loop
      while (celsius <= 100) {
         if ((celsius % 5) == 0) {
            double fahrenheit = ((9.0 / 5.0) * celsius) + 32;
            System.out.printf("%-7s  %-10s", celsius, fahrenheit);
            System.out.println("");
            count++;
            if ((count % 5) == 0) {
               System.out.println("");
            }
         }
         celsius++;
      }
   }
}