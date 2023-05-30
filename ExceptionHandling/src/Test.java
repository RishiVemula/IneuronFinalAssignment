import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		try {
			if (number<0) {
				scanner.close();
				throw new Exception("Invalid Input: Entered number in negative");
			}
		} catch (Exception e) {
			System.out.println("Please enter a positive number");
		}
		System.out.println("Your entered number is: "+number);
		scanner.close();
	}
}