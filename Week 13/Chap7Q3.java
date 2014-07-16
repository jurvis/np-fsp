import java.util.Scanner;

public class Chap7Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1;

		int[] markArr = new int[5];
		String[] nameArr = new String[5];
		char[] gradeArr = new char[5];

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
				case 4:	displayStudentDetailsWithGrade(nameArr, markArr, gradeArr);
						break;
				/*case 5:	int index = findLowestMark(markArr);
						System.out.printf("The student with the lowest mark %d is %s\n", markArr[index], nameArr[index]);
						break;*/
				default:
						break;
			}
		} while (choice != 0);
	}

	//Lowest mark (in Q4, ignored)
	/*public static int findLowestMark(int[] markArr) {
		int lowest = 999, index = 0;
		for (int i = 0; i < markArr.length; i++) {
			if (markArr[i] < lowest) {
				lowest = markArr[i];
				index = i;
			}
		}
		return index;
	}*/

	//Display students and marks above avg
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

	//Begin grade
	public static char findGrade(int mark) {
		if (mark >= 80) {
			return 'A';
		} else if (mark >= 70) {
			return 'B';
		} else if (mark >= 60) {
			return 'C';
		} else if (mark >= 50) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public static void assignGrade(int[] markArr, char[] gradeArr) {
		for (int i = 0; i < markArr.length; i++) {
			gradeArr[i] = findGrade(markArr[i]);
		}
	}

	public static void displayStudentDetailsWithGrade(String[] nameArr, int[] markArr, char[] gradeArr) {
		assignGrade(markArr, gradeArr);
		System.out.printf("%s\t%s\t%s\t%s\n", "S/No", "Name", "Mark", "Grade");
		System.out.printf("%s\t%s\t%s\t%s\n", "----", "----", "----", "-----");

		for (int i = 0; i < nameArr.length; i++) {
			System.out.printf("%d.\t%s\t%s\t%s\n", i + 1, nameArr[i], markArr[i], gradeArr[i]);
		}
	}
	//End grade

	//Calc avg
	public static double calculateAverage(int[] markArr) {
		int total = 0;
		for (int i = 0; i < markArr.length; i++) {
			total += markArr[i];
		}

		return (double)total / markArr.length;
	}

	//Display details without grade
	public static void displayStudentDetails(String[] nameArr, int[] markArr) {
		System.out.printf("%s\t%s\t%s\n", "S/No", "Name", "Mark");
		for (int i = 0; i < nameArr.length; i++) {
			System.out.printf("%d.\t%s\t%s\n", i + 1, nameArr[i], markArr[i]);
		}
	}

	//Menu
	public static void displayMenu() {
		System.out.println("Main Menu");
		System.out.println("1) Display student names and marks");
		System.out.println("2) Calculate and display the average mark");
		System.out.println("3) Display students with their marks above the average mark");
		System.out.println("4) Display student details with grade");
		//Q4, ignore
		//System.out.println("5) Display student with the lowest mark");
		System.out.println("0) Exit");
	}
}