/* This program accepts an integer as the number of seconds
 it calculates the time in hours, minutes and seconds for you. DO NOT leave it empty because
 there is no error handling. */
import java.util.Scanner;
public class Chap3Q2 {
    
	public static void main (String[] args) {
		int timeInSeconds;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time in seconds: ");
		timeInSeconds = input.nextInt();
		calculateSeconds (timeInSeconds);
	}
	public static void calculateSeconds (int seconds) {
		int hours = seconds / 3600;
		int mins = (seconds % 3600) / 60;
		seconds = seconds % 60;
        
		int[] ints = {hours, mins, seconds};
		System.out.printf("%d Hours, ", ints[0]);
		System.out.printf("%d Minutes,", ints[1]);
		System.out.printf("%d Seconds.", ints[2]);
	}
}
