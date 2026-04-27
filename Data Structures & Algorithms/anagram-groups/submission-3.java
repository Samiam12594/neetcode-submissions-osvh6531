class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create hashmap where,
        //our Key will be a string we get by turning the requisite 'c' count array into a string
        //value will be the actual anagram sublists themselves.
        Map<String, List<String>> groups = new HashMap<>();
        for(String i:strs){
            //create new 'c' count array for every word in loop
            //this allows us to create a unique key that has two purposes:
            // 1. it will tell us if words coming after are indeed anagrams
            // 2. it will be used to separate distinct anagram groups from eachother in the hashmap 
            int[] c = new int[26];
            //updating count array to map to the current string being checked.
            for (char a : i.toCharArray()){
                c[a - 'a']++;
                //by the end of this loop, a 26 unit array should be created
                //e.g. "eat" -> (1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0)
            }
            //converting the finished array to a string for keying
            String hi = Arrays.toString(c); 
            //if the current index does not exist in our hashMap
            //we create a new entry with its own sublist in it for future checks
            groups.putIfAbsent(hi, new ArrayList<>());
            //put the current word in its corresponding key
            groups.get(hi).add(i);
        }
        return new ArrayList<>(groups.values());
    }
}
