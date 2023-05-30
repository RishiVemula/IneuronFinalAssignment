import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }

        // Find the second largest and second smallest elements
        Integer secondLargest = findSecondLargest(numbers);
        Integer secondSmallest = findSecondSmallest(numbers);

        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
    }

    private static Integer findSecondLargest(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers.get(numbers.size() - 2);
    }

    private static Integer findSecondSmallest(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers.get(1);
    }
}
