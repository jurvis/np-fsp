public class ConvertBetweenFootAndMetre {

	public static double footToMetre (double foot) {
		double metre = 0.305 * foot;
		return metre;
	}

	public static double metreToFeet (double metre) {
		double foot = 3.279 * metre;
		return foot;
	}

	public static void main (String[] args) {
		System.out.println("Feet\tMetres\t|\tMetres\tFeet");
		double m2 = 20;
		for (double f1 = 1; f1 < 11; f1++) {
			System.out.printf("%.3f\t%.3f\t|\t%.3f\t%.3f\n", f1, footToMetre(f1), m2, metreToFeet(m2));
			m2 += 5;
		}
	}
}
