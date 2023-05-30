import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create a large dataset
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            numbers.add(i);
        }

        // Perform sorting operation using stream
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();

        System.out.println("Sorted numbers:");
        System.out.println(sortedNumbers);

        // Perform filtering operation using stream
        List<Integer> filteredNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();

        System.out.println("Filtered numbers (even numbers only):");
        System.out.println(filteredNumbers);
    }
}

