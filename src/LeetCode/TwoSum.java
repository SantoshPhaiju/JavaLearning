package LeetCode;

public class TwoSum {
    public static void main(String[] args) {
        int[] ans = Solution.twoSum(new int[]{3, 2, 4}, 6);
        for (int an : ans) {
            System.out.println(an);
        }
    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
