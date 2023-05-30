import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		if (number<0) {
			scanner.close();
			throw new Exception("Invalid Input: Entered number in negative");
		}
		System.out.println("Your entered number is: "+number);
		scanner.close();
	}
}

