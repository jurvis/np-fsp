public class PrintSeriesTable {
	public static double computeSeries(int i) {
		double total = 0;
		for (int n = 0; n <= i; n++) {
			total += ((double)n/(n+1));
		}
		return total;
	}

	public static void main (String[] args) {
		System.out.printf("i\tm(i)\n");
		for (int c = 1; c <= 20; c++) {
			System.out.printf("%d\t%f\n", c, computeSeries(c));
		}
	}
}
