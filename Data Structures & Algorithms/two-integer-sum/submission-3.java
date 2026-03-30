class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hi = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            hi.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++){
            int d = target - nums[i];
            if (hi.containsKey(d) && hi.get(d) != i){
                return new int[]{i, hi.get(d)};
            }
        }
        return new int[0];
    }
}
