import java.util.Scanner;
public class DeterminePalindrome {
	public static int reverse (int number) {
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number/10;
		}
		System.out.println(reverse);
		return reverse;
	}

	public static boolean isPalindrome(int user, int reversedValue) {
		if (user == reversedValue) {
			return true;
		} else {
			return false;
		}
	}

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int user;

		System.out.print("Enter a number: ");
		user = s.nextInt();

		int reversedValue = reverse(user);
		boolean check = isPalindrome(user, reversedValue);
		if (check == true) {
			System.out.print("The Number is a Palindrome");
		} else {
			System.out.print("The Number is not a Palindrome");
		}
	}
}
