package Week2;

public class Integer {
    public static void minmax() {
        int[] numb = {19,2,40,30,1,7};

        int small = numb[0];
        int large = numb[0];

        for (int i = 1; i < numb.length; i++) {
            if (numb[i] < small) {
                small = numb[i];
            }
            if (numb[i] > large) {
                large = numb[i];
            }
        }
System.out.println(" ");
        System.out.println("The Smallest number in a given set  is : " + small);
        System.out.println("The Largest number in a given set : " + large);
    }
}
