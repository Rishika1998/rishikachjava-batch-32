package week4;

    import java.util.ArrayList;
import java.util.Arrays;

    public class ToArray {
        public static void main(String args[]) {
            ArrayList<String> arrayList = new ArrayList<>();

            arrayList.add("rishika");
            arrayList.add("Bunny");
            arrayList.add("Cheruku");

            String[] arr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                arr[i] = arrayList.get(i);
                System.out.println(arr[i]);
            }
        }

}
