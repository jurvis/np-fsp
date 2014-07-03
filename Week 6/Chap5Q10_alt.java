import java.util.Scanner;
public class Chap5Q10 {
	public static void main (String[] args) {
		// declare new scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your NRIC: ");
		// if string input has any other character except for an integer, strip it from input.
		String NRIC = input.nextLine().replaceAll("[^0-9]","");

		// declare a new array 'numbers' with 7 elements
		int[] numbers = new int[7];
		// iterate through 'numbers' array and append multiplicated value to it
		for (int i = 0; i < NRIC.length(); i++){
			// use .charAt(i) to get individual digit as char
    		char c = NRIC.charAt(i);
    		// convert char to integer
    		int digit = Character.getNumericValue(c);
    		switch (i) {
    			case 0: numbers[i] = digit * 2;break;
    			case 1: numbers[i] = digit * 7;break;
    			case 2: numbers[i] = digit * 6;break;
    			case 3: numbers[i] = digit * 5;break;
    			case 4: numbers[i] = digit * 4;break;
    			case 5: numbers[i] = digit * 3;break;
    			case 6: numbers[i] = digit * 2;break;
    			default: break;
    		}
		}

		// declare sum of products, remainder and subtracted values
		int totalcount = 0, remainder, result;
		// declare a char for the check digit
		char cd = 'L';
		// iterate through all elements in numbers array and sum them up in the variable 'totalcount'
		for (int element: numbers) {
			totalcount += element;
		}
		// find remainder when totalcount is divided by 11
		remainder = totalcount % 11;
		// take 11 minus the remainder
		result = 11 - remainder;
		switch (result) {
			case 1: cd = 'A'; break;
			case 2: cd = 'B'; break;
			case 3: cd = 'C'; break;
			case 4: cd = 'D'; break;
			case 5: cd = 'E'; break;
			case 6: cd = 'F'; break;
			case 7: cd = 'G'; break;
			case 8: cd = 'H'; break;
			case 9: cd = 'I'; break;
			case 10: cd = 'Z'; break;
			case 11: cd = 'J'; break;
			default: break;
		}
		System.out.printf("The check digit is %s", cd);
	}
}
