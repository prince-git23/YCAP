import java.util.*;

public class twosum {

    public static int[] twoSum(int[] nums, int size, int target) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int size = 4;

        int[] result = twoSum(nums, size, target);

        System.out.println(result[0] + " " + result[1]);
    }
}
