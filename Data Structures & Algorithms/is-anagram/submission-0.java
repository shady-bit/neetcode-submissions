
class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        // Count characters in s
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Subtract counts using t
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) return false; // extra safeguard
        }

        // Verify all counts are zero
        for (int count : map.values()) {
            if (count != 0) return false;
        }

        return true;
    }
}
