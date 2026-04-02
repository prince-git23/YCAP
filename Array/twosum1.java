import java.util.*;

public class twosum1{

    public static int[] twoSum(int[] nums, int numsSize, int target) {
        for (int i = 0; i < numsSize; i++) {
            for (int j = i + 1; j < numsSize; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int size = 4;
        int target = 9;

        int[] data2 = twoSum(a, size, target);

        if (data2 != null) {
            System.out.println("Index " + data2[0] + " " + data2[1]);
        } else {
            System.out.println("Target is Not matched");
        }
    }
}
