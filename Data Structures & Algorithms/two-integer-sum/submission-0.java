class Solution {
    public int[] twoSum(int[] nums, int target) {

        int [] solution = new int[2];

        for (int i = 0; i< nums.length; i++){
            for (int c = i + 1 ; c < nums.length; c++){
                if (nums[i] + nums[c] == target) {
                solution[0] = i;
                solution[1] = c;
                return solution;
                }
            }
        }
        return solution;
    }
}
