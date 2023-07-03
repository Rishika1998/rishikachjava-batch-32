package week3;

import java.util.Scanner;

public class StringtoInteger {
    public void test() {
        try {
            System.out.print("Enter a number :");
            Scanner sc= new Scanner(System.in);
            String str= sc.nextLine();

            int i = Integer.parseInt(str);
            //System.out.println("");
            System.out.println("String converted to number is :"+i);


        } catch (NumberFormatException e) {

            System.out.println("The number format exception");

        }
}
}
