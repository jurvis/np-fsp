// this program is just a simple Scissors Paper Stone game. 0 represents Scissors, 1 as Paper, 2 and Stone.
import java.util.Scanner;
public class ScissorsPaperStone
{
   public static void main(String[] args) {
      // generate random number and cast it as an integer
      int computer = (int)(Math.random()*3);

      //declare scanner object and receive input
      Scanner input = new Scanner(System.in);
      System.out.print("Scissors (0), Paper (1). Stone (2): ");
      int player = input.nextInt();

      // compute the various possible cases by user's selection
      switch (player){
         case 0: if (computer==2) {
                         System.out.print("The computer is stone. You are scissors. You lose.");
                     } else {
                        if (computer==1) {
                           System.out.print("The computer is paper. You are scissors. You won.");
                        } else {
                           System.out.print("The computer is scissors. You are scissors too. It is a draw.");
                        }
                     }
         case 1: if (computer==2) {
                        System.out.print("The computer is stone. You are paper. You won.");
                     } else {
                         if (computer==1) {
                           System.out.print("The computer is paper. You are paper too. It is a draw.");
                        } else {
                           System.out.print("The computer is scissors. You are paper. You lose.");
                        }
                     }
         case 2: if (computer==2) {
                        System.out.print("The computer is stone. You are stone too. It is a draw.");
                     } else {
                           if (computer==1) {
                           System.out.print("The computer is paper. You are stone. You lose.");
                           } else {
                              System.out.print("The computer is scissors. You are stone. You won.");
                           }
                     }
      }
   }
}
