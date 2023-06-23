package week4;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
public class hashimpl {
        public static void main(String[] args) {
            HashSet<String> fruitSet = new HashSet();
            fruitSet.add("dhenu");
            String[] strings = {"ashok", "bunny", "cherry", "dimpy","eshwar", "family", "girls","heyansh"};
            fruitSet.addAll(Arrays.asList(strings));
            System.out.print(fruitSet+"  ");
            System.out.println(" ");
            System.out.println("----------------- DISPLAYING USING ITERATOR-------------");
            System.out.println(" ITERATOR: ");
            Iterator<String> itr=fruitSet.iterator();
            while(itr.hasNext()) {
                System.out.print(itr.next() + "  ");
            }
            System.out.println(" ");
            System.out.println("------------------DISPLAY USING FOREACH------------------");
            System.out.println("FOREACH:  ");
            fruitSet.forEach(i -> {System.out.print(i + " ");
            });
            System.out.println(" ");
            System.out.println("--------------STREAM FOREACH--------------");
            System.out.println("Streams ForEach: ");
            fruitSet.stream().forEach(i -> System.out.print(i+" "));
        }
    }
