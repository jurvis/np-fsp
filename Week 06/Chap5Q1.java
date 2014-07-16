//This program converts Celsius to Fahrenheit from 0 - 100 C in increments of 5. It uses a while loop.
public class Chap5Q1 {
   public static void main(String[] args) {
      //Define variables
      int celsius = 0;
      
      //Print column heading
      System.out.printf("%-7s  %-10s", "Celsius", "Fahrenheit");
      System.out.println("");
      
      //While loop
      while (celsius <= 100) {
         if ((celsius % 5) == 0) {
            double fahrenheit = ((9.0 / 5.0) * celsius) + 32;
            System.out.printf("%-7s  %-10s", celsius, fahrenheit);
            System.out.println("");
            
         }
         celsius++;
      }
   }
}