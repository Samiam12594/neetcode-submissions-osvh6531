class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsarray = new HashMap<>();

        int[] finalnums = new int[k];

        for (int i:nums){numsarray.put(i, numsarray.getOrDefault(i, 0) + 1);}
       
        Map.Entry<Integer, Integer> maxEntry = Collections.max(numsarray.entrySet(), Map.Entry.comparingByValue());
        Integer maxValue = maxEntry.getKey();
        finalnums[0] = maxValue;
        if (k > 1){
            for (int i = 1; i < k ; i++){
                numsarray.remove(maxValue);
                maxEntry = Collections.max(numsarray.entrySet(), Map.Entry.comparingByValue());
                maxValue = maxEntry.getKey();
                finalnums[i] = maxValue;
                System.out.println(maxValue);
            }
        }
        return finalnums;
        
    }
}
