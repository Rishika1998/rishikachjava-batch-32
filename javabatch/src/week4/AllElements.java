
    package week4;

import java.util.ArrayList;
import java.util.*;

    public class AllElements {
        public static void main(String args[]) {
            ArrayList<String> arrayList = new ArrayList<>();

            arrayList.add("rishika");
            arrayList.add("bunny");
            arrayList.add("sathi");
            arrayList.add("snef");
            arrayList.add("vam");

            System.out.println("******* FOR LOOP ********");
            for (int i = 0; i < arrayList.size(); i++) {
                String slayer = arrayList.get(i);
                System.out.println(slayer);
            }
            System.out.println("******* ENHANCED FOR LOOP *******");
            for (String slayer : arrayList) {
                System.out.println(slayer);
            }

            System.out.println("******* ITERATOR ********");
            Iterator<String> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                String slayer = iterator.next();
                System.out.println(slayer);
            }
            int length =arrayList.size();
            arrayList.remove(length-1);
            System.out.println("********* FOR EACH ********");
            arrayList.forEach(slayer -> System.out.println(slayer));
            System.out.println("******** PARALLEL **********");
            arrayList.parallelStream().forEach(slayer -> System.out.println(slayer));



        }
    }
