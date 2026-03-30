class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for(String i:strs){
            char[] character = i.toCharArray();
            Arrays.sort(character);
            String hi = new String(character);
            if (!groups.containsKey(hi)){
                groups.put(hi, new ArrayList<>());
            }
            groups.get(hi).add(i);
        }
        return new ArrayList<>(groups.values());
    }

}
