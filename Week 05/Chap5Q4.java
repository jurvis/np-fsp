public class Chap5Q4 {
      public static void main (String[] args) {
      int c = 0;
      for (int i = 0; i <= 100; i +=5 ) {
            double f = ((9*i)/5)+32;
            System.out.printf("%d\t%4.1f\n", i ,f);
            if (c == 0) {
      	     c++;
            } else if (c % 5 == 0 ){
      	     System.out.printf("\n");
            }
            c++;
      	}
      }
}
