package week4;
import java.util.HashSet;
import java.util.Scanner;
public class duplicatehash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        HashSet<Character> newset = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            newset.add(s.charAt(i));
        }
        //System.out.println(mySet);
        System.out.print(" The characters in the given string are: ");
        newset.forEach(i -> System.out.print(i));
    }
}
