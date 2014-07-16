public class Chap7Q1 {
	public static void main (String[] args) {
		int[] numbersArray = new int[10];
		for (int i = 9; i >= 0; i--) {
			int randomInteger = (int)(Math.random() * 45) +1;
			numbersArray[i] = randomInteger;
			System.out.printf("num[%d] = %d\n", i, numbersArray[i]);
		}
	}
}
