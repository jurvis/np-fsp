public class Chap5Q3
{
   public static void main(String[] args)
   {
      int c = 0;
      System.out.println("Celcius\tFahrenheit");
      do
      {
         double f = ((9*c)/5)+32;
         System.out.printf("%d\t%.1f\n", c ,f);
         c = c+5;
      }
      while (c<=100);
   }
}
