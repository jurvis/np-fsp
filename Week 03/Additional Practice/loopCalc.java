public class loopCalc {
	public static void main (String[] args) {
		System.out.println("number     square      cube");

		for (int i = 0; i < 11; i++) {
			System.out.printf("%-11d", i);
			System.out.printf("%-12d", i*i);
			System.out.printf("%-1d\n", i*i*i);
		}
	}
}
