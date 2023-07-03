package Week2;

public class ReverseArray {
    public static void rev() {
        System.out.println("Reverse Array:");

        int arr[] = {4, 6, 3, 2, 9};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
    }
}