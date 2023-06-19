package week3;
import java.util.Arrays;
public class average {
        public static void main(String[] args) {
            Integer[] numbers = {1, 2, 4, 5, 6, 7, 9, 10};

            double avgOfSqrs = Arrays.stream(numbers)
                    .filter(n -> n % 2 != 0)
                    .mapToDouble(n -> n * n)
                    .average()
                    .orElse(0);

            System.out.println("Average of squares of odd numbers: " + avgOfSqrs);
    }
}
