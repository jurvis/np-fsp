import java.util.Scanner;

public class Chap7Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1;

		int[] markArr = new int[5];
		String[] nameArr = new String[5];

		nameArr[0] = "Peter";
		nameArr[1] = "Jane";
		nameArr[2] = "Lucy";
		nameArr[3] = "John";
		nameArr[4] = "Patrick";

		markArr[0] = 67;
		markArr[1] = 50;
		markArr[2] = 77;
		markArr[3] = 89;
		markArr[4] = 34;

		do {
			displayMenu();
			System.out.print("Enter your option: ");
			choice = input.nextInt();

			switch (choice) {
				case 1:	displayStudentDetails(nameArr, markArr);
						break;
				case 2: System.out.printf("The average mark is %.1f\n", calculateAverage(markArr));
						break;
				case 3:	displayAboveAverage(nameArr, markArr);
						break;
				default:
						break;
			}
		} while (choice != 0);
	}

	public static void displayAboveAverage(String[] nameArr, int[] markArr) {
		double avg = calculateAverage(markArr);
		int count = 1;

		System.out.println("Students who score above average:");
		for (int i = 0; i < markArr.length; i++) {
			if (markArr[i] > avg) {
				System.out.printf("%d. %s\n", count, nameArr[i]);
			}
			count++;
		}
	}

	public static double calculateAverage(int[] markArr) {
		int total = 0;
		for (int i = 0; i < markArr.length; i++) {
			total += markArr[i];
		}

		return (double)total / markArr.length;
	}

	public static void displayStudentDetails(String[] nameArr, int[] markArr) {
		System.out.printf("%s\t%s\t%s\n", "S/No", "Name", "Mark");
		for (int i = 0; i < nameArr.length; i++) {
			System.out.printf("%d.\t%s\t%s\n", i + 1, nameArr[i], markArr[i]);
		}
	}

	public static void displayMenu() {
		System.out.println("Main Menu");
		System.out.println("1) Display student names and marks");
		System.out.println("2) Calculate and display the average mark");
		System.out.println("3) Display students with their marks above the average mark");
		System.out.println("0) Exit");
	}
}