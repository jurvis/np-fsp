import java.util.Scanner;
public class chap5Q7
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int answer = (int)(Math.random()*100+1);
      while (true)
      {
         while (true)
         {
            System.out.print("Try to guess the number between 1 and 100: ");
            int guess = input.nextInt();
            if (guess==answer)
            {
               System.out.println("Congratulations, you won!");
               break;
            }
            else if (guess>answer && guess<100)
            {
               System.out.println("Your guess is too high.");
            }
            else if (guess<answer && guess>0)
            {
               System.out.println("Your guess is too low.");
            }
            else if (guess<0 || guess>100)
            {
               System.out.println("Invalid guess.");
            }
         }
         System.out.println("Do you want to play again?");
         System.out.print("True or False: ");
         boolean reply = input.nextBoolean();
         if (reply==false)
         {
            break;
         }
         else if (reply==true)
         {
            answer=(int)(Math.random()*100+1);
         }
      }
   }
}