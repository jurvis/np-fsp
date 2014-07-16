public class Chap5Q1
{
   public static void main(String[] args)
   {
      int c = 0;
      System.out.printf("Celcius\tFahrenheit\n");
      while (c <= 100)
      {
         double f = ((9*c)/5) + 32;
         System.out.printf("%d\t%.1f\n", c ,f);
         c = c + 5;
      }
   }
}
