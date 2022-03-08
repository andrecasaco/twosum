import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] values = {2, 7, 4, -2};
        int target = 2;

        System.out.println(twoSum1(values, target));
        System.out.println(twoSum(values, target));

    }

    private static void test(int[] values, int target) {
        for (int i = 0; i < values.length; i++)
            for (int j = i + 1; j < values.length; j++)
                if (values[i] + values[j] == target)
                    System.out.println("number " + values[i] + " at index " + i + " + "
                            + "number " + values[j] + " at index " + j + " = " + target);
    }
    //quick approach use a nested for loop to check if the sum of two elements is equal to the target given
    //big O(n^2)
    static boolean twoSum1(int[] values, int target) {
        for (int i = 0; i < values.length; i++)
            for (int j = i + 1; j < values.length; j++)
                if (values[i] + values[j] == target)
                    return true;
        return false;
    }

    /*
       Loop through every number in the array

       if set contains the given target true is returned

       otherwise add the number to the set

       if the end of the array is reached, return false no number found
        */
    static boolean twoSum(int[] values, int target) {
        Set<Integer> set = new HashSet<>();

        for (int num : values) {
            if (set.contains(num)) {
                return true;
            }
            set.add(target - num);
        }
        return false;
    }
}
