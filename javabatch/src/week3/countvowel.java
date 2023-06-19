package week3;
import java.util.Arrays;
public class countvowel {

        public static void main(String[] args) {
            String[] strings = {"rishika", "bunny", "cheruku", "pindi","satyam"};

            Arrays.stream(strings)
                    .filter(s -> s.matches(".*[aeiouAEIOU].*"))
                    .forEach(s -> System.out.println(s + " has " + countVowels(s) + " vowels"));
        }


        private static int countVowels(String str) {
            return str.replaceAll("(?i)[^aeiouAEIOU]", "").length();
}

    }
