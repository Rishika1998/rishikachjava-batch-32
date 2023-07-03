package week3;

import java.util.Arrays;
import java.util.Comparator;

public class FirstLetterCap {
    public static void main(String[] args) {
        String[] strings = {"rishika", "bunny", "cheruku", "pindi", "satyam"};

        String[] capitalizedStrings = Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .toArray(String[]::new);

        Arrays.sort(capitalizedStrings, Comparator.naturalOrder());

        Arrays.stream(capitalizedStrings)
                .forEach(System.out::println);
    }


}
