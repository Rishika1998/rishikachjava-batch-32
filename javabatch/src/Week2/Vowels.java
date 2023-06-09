package Week2;

public class Vowels {
        String na = "rishika priya";
        int len=na.length();
        int count = 0;

        public int ct(){
        for (int i = 0; i < na.length(); i++) {
            if (na.charAt(i) == 'a' || na.charAt(i) == 'e' || na.charAt(i) == 'i' || na.charAt(i) == 'o' || na.charAt(i) == 'u')
                count++;
        }
        return count++;
    }

}

