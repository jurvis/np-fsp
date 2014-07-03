public class Chap5Q2
{
   public static void main(String[] args)
   {
      System.out.println("Celcius\tFahrenheit");
      for (int c=0; c<=100; c=c+5)
      {
         double f = ((9*c)/5)+32;
         System.out.printf("%d\t%.1f\n", c ,f);
      }
   }
}
