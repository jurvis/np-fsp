import java.lang.Math.*;
public class Chap2Q3 {
   public static void main(String[] args) {
      //Declare variables
      double radius; //Radius
      double area; //Area
      double circumference; //Circumference
      
      //Assign values
      radius = 5.0;
      area = Math.PI * (radius * radius);
      circumference = Math.PI * 2 * radius;
      
      //Print results
      System.out.println("Radius of circle: " + radius);
      System.out.println("Area of circle: " + area);
      System.out.println("Circumference of circle: " + circumference);
      
      //New radius computation
      radius = 18.50;
      area = Math.PI * (radius * radius);
      circumference = Math.PI * 2 * radius;
      
      //Print results
      System.out.println("Radius of circle: " + radius);
      System.out.println("Area of circle: " + area);
      System.out.println("Circumference of circle: " + circumference);
   }
}