package Week2;

import java.util.Arrays;

public class Anagram {


    public void ana() {
        String s1 = "ant";
        String s2 = "tan";
        if(s1.length()!=s2.length()) {
            System.out.print("it  is not a anagram");
        }else {
            char[] str1 = s1.toCharArray();
            char[] str2 = s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            System.out.print(Arrays.equals(str1,str2));
        }
    }
}