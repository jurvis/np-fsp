public class Chap7Q1 {
	public static void main(String[] args) {
		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {
			int num = (int)(Math.random()*45) + 1;
			array[i] = num;
		}

		for (int a = 9; a >= 0; a--) {
			System.out.printf("num[%d] = %d\n", a, array[a]);
		}
	}
}