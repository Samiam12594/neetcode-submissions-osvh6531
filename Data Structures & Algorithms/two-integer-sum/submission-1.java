class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int c = i + 1 ; c < nums.length; c++){
                if (nums[i] + nums[c] == target) {
                    return new int[]{i,c};
                }
            }
        }
        return new int[0];
    }
}
