class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int count = 0;
        for (int i:nums){
            if (s.contains(i)){
                return true;
            }
            count++;
            s.add(i);
        }
        System.out.println("O(n) = " + count);
        return false;
    }


}