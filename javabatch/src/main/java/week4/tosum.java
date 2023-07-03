package week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class tosum{
    public static int[] findNumbers(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(numbers[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50, 60 };
        int target = 100;
        int[] indices = findNumbers(numbers, target);
        System.out.println(Arrays.toString(indices));
    }
}
