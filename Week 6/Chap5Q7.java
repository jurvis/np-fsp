import java.util.Scanner;
import java.lang.Math;

public class Chap5Q7 {
   public static void main(String[] args) {
      //Define variables
      Scanner s = new Scanner(System.in);
      int toguess, guess, play = 1; //Play (0=stop, 1=continue)
      
      //Generate number
      toguess = (int)(Math.random() * (100 + 1));
      
      
      
      while (play == 1) {
         //Ask for guess
         System.out.print("Guess the number (0 - 100): ");
         guess = s.nextInt();
         
         if (guess == toguess) {
            System.out.println("You guessed the number!");
            System.out.print("Do you want to try again? (0 = no, 1 = yes): ");
            int choice = s.nextInt();
            if (choice != 1) {
               play = 0;
               System.out.println("You have exited.");
            }
         } else {
            if (guess < toguess) {
               System.out.println("Your value is too low!");
            } else if (toguess < guess) {
               System.out.println("Your value is too high!");               
            }
         }
      }
   }
}