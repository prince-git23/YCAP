import java.util.*;

public class 3sum2{

    List<List<Integer>> final_result = new ArrayList<>();

    void twoSum(int[] nums, int target, int i, int j) {
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                while (i < j && nums[i] == nums[i + 1]) i++;
                while (i < j && nums[j] == nums[j - 1]) j--;
                final_result.add(Arrays.asList(-target, nums[i], nums[j]));
                i++;
                j--;
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if (n < 3) return new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int n1 = nums[i];
            int target = -n1;

            twoSum(nums, target, i + 1, n - 1);
        }
        return final_result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = obj.threeSum(nums);

        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
