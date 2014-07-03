import java.util.Scanner;
public class Chap5Q8 {
	public static void main(String[] args) {
		// take in 10 values of marks and append them to array
		int[] gradesArray = new int[11];
		for (int i = 1; i < 11; i++) {
			Scanner input = new Scanner(System.in);
			System.out.printf("Enter marks for student number %d: ", i);
			gradesArray[i] = input.nextInt();
		}

		// count amount of times
		int countOfPasses = 0;
		for (int i = 1; i < 11; i++) {
			if (gradesArray[i] > 49) {
				countOfPasses++;
			}
		}
		System.out.printf("%d amount of students passed the test\n", countOfPasses);

		// count number of students per grade
		int countA = 0, countB = 0, countC = 0 , countD = 0, countF = 0;
		for (int i =1; i < 11; i++) {
			int tmp = gradesArray[i];
			if (tmp > 80) {
				countA++;
			} else if (tmp > 70) {
				countB++;
			} else if (tmp >60) {
				countC++;
			} else if (tmp > 50) {
				countD++;
			} else {
				countF++;
			}
		}
		System.out.printf("%d scored A, %d scored B, %d scored C, %d scored D, %d scored F", countA, countB, countC, countD, countF);
	}
}
