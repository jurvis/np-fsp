public class DisplayPattern {

	public static void printLinePattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int a = (n - i); a > 0; a--) {
				System.out.print("\t");
			}

			for (int a = i; a > 0; a--) {
				System.out.printf("%d\t", a);
			}

			System.out.println(" ");
		}
	}

	public static void main (String[] args) {
		printLinePattern(4);
	}
}
