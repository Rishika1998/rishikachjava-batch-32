package week3;
import week3.StringtoInteger;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        /* day 12 question 1

        String st1[]={ "23", "45.67" , "test", "123f"};
        StringtoInteger sti=new StringtoInteger();
        sti.test();
        //day 12 question 2
        System.out.println("Enter a string");
        Scanner sc1=new Scanner(System.in);
        String s1=sc1.nextLine();
        CustomException CE=new CustomException();
        CE.conversionToIntCustom(s1);*/
        //day13 question 1
        System.out.println("printing 1 to 10 using thread class");
        ThreadClass TC = new ThreadClass();
        TC.start();
    //day 13 question 2
        System.out.println("printing 1 to 10 numbers using runnable interface");
        RunnableInterface RI=new RunnableInterface();
        RI.run();
    }
}
