class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create map that contains a key(integers in nums array) and value(index of respective integer in nums array)
        Map<Integer, Integer> hi = new HashMap<>();
        //looping to check if our target key exists in hashmap
        for (int i = 0; i < nums.length; i++){
            // value of current index (num)
            int num = nums[i];
            // subtracting target value (target) with the current value (num) 
            // gives us a difference that we can check for in the hashmap
            int d = target - num;
            //if the hashmap @ this stage contains our target key, we have arrived at our two sum solution and return the indexes
            if (hi.containsKey(d)){
                //return the index of the found difference (d) and index of the current number (i)
                return new int[]{hi.get(d), i};
            }
            //if prev conditon not met, add the current value (num) and its index (i) into the hashmap
            hi.put(num,i);
        }
        //if loop completes and no condition is met, there is no two sum solution in nums array, return empty array.
        return new int[0];
    }
}
