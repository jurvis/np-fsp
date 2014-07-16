import java.util.Scanner;
public class Chap7Q3 {
	public static void main (String[] args) {
		int[] markArr = {67, 50, 77, 89, 34};
		String[] nameArr = new String[]{"Peter", "Jane", "Lucy", "John", "Patrick"};
		char[] gradeArr = new char[5];

		boolean checker = false;
		while (checker == false) {
			int selection = displayMenu();
			switch (selection) {
			case 1: displayStudentDetails(nameArr, markArr); break;
			case 2: calculateAverage(markArr); break;
			case 3: displayAboveAverage(nameArr, markArr); break;
			case 4: displayStudentDetailsWithGrade(nameArr, markArr, gradeArr); break;
			default: checker = true; break;
			}
		}
	}

	//Display the main menu
	public static int displayMenu() {
		Scanner receiver = new Scanner(System.in);
		System.out.println("Main Menu");
		System.out.println("1) Display student names and marks");
		System.out.println("2) Calculate and display the average mark");
		System.out.println("3) Display students with marks above the average marks");
		System.out.println("4) Display students with grade");
		System.out.println("0) Exit");

		System.out.print("Enter your option: ");
		int input = receiver.nextInt();

		return input;
	}

	//Display Students Details With Grade
	public static void displayStudentDetailsWithGrade(String[] nameArr, int[] markArr, char[] gradeArr) {
		assignGrade(markArr, gradeArr);
		System.out.printf("S/No\tName\tMark\tGrade\t\n");
		System.out.printf("----\t----\t----\t-----\n");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d.\t%s\t%d\t%c\n", i, nameArr[i], markArr[i], gradeArr[i]);
		}

	}

	public static void assignGrade(int[] markArr, char[] gradeArr) {
		for (int i = 0; i < markArr.length; i++) {
			gradeArr[i] = findGrade(markArr[i]);
		}
	}

	public static char findGrade(int mark) {
		if (mark > 80) {
			return 'A';
		} else if (mark > 70) {
			return 'B';
		} else if (mark > 60) {
			return 'C';
		} else if (mark > 50) {
			return 'D';
		} else {
			return 'F';
		}
 	}

 	// Other Menus
	public static void displayStudentDetails(String[] nameArr, int[] markArr) {
		System.out.printf("S/No\tName\tMark\n");
		for (int i = 0; i < markArr.length; i++) {
			System.out.printf("%d.\t%s\t%d\n", i, nameArr[i], markArr[i]);
		}
	}

	public static void calculateAverage(int[] markArr) {
		int total = 0;
		for (int i = 0; i < markArr.length; i++) {
			total += markArr[i];
		}
		double average = (double)total/markArr.length;
		System.out.printf("The average mark is %.1f\n", average);
	}

	public static void displayAboveAverage (String[] nameArr, int[] markArr) {
		System.out.println("Students who score above average: ");
		int total = 0;
		for (int i = 0; i < markArr.length; i++) {
			total += markArr[i];
		}
		double average = total/markArr.length;

		int counter = 1;
		for (int i = 0; i < markArr.length; i++) {
			if (markArr[i] > average) {
				System.out.printf("%d. %s\n", counter, nameArr[i]);
				counter++;
			}
		}
	}
}
