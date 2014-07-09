import java.util.Scanner;
import java.lang.Math;

public class CalculateWindChillTemp {
   public static void main(String[] args) {
      //Declare variables
      Scanner s = new Scanner(System.in);
      double otemp, wspeed, windchill;
      
      //Accept input
      System.out.print("Enter the outside temperature (in Fahrenheit): ");
      otemp = s.nextDouble();
      
      System.out.print("Enter the wind speed (in mph): ");
      wspeed = s.nextDouble();
      
      if ((otemp >= -58) && (otemp <= 41)) {
         if (wspeed < 2) {
            windchill = 35.74 + (0.6215 * otemp) - (35.75 * Math.pow(wspeed, 0.16)) + (0.4275 * otemp * Math.pow(wspeed, 0.16));
            System.out.println("The wind-chill index is " + windchill);
         } else {
            System.out.println("Incorrect input");
         }
      } else {
         System.out.println("Incorrect input");
      }
   }
}