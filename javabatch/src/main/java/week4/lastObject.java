package week4;

import java.util.ArrayList;

public class lastObject {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("rishika");
        list.add("chinnu");
        list.add("pathi");
        list.add("chada");

        System.out.println("The array list: " + list);

        list.remove(list.size() - 1);

        System.out.println("Array list after removing last object: " + list);
    }
}
