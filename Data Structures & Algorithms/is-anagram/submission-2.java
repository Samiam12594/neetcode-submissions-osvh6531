class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> cs = new HashMap<>();
        HashMap<Character, Integer> ct = new HashMap<>();
        for (char c : s.toCharArray()){
            cs.put(c, cs.getOrDefault(c,0) +1);
        }
        for (char c : t.toCharArray()){
            ct.put(c, ct.getOrDefault(c,0) +1);
        }

        return cs.equals(ct);
        


    }
}
