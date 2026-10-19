import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }
        int[] countP = new int[26];
        int[] countS = new int[26];
        for (int i = 0; i < p.length(); i++) {
            countP[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            countS[s.charAt(i) - 'a']++;
        }
        if (same(countP, countS)) {
            result.add(0);
        }
        for (int right = p.length(); right < s.length(); right++) {
            countS[s.charAt(right) - 'a']++;
            int left = right - p.length();
            countS[s.charAt(left) - 'a']--;
            if (same(countP, countS)) {
                result.add(left + 1);
            }
        }
        return result;
    }
    public boolean same(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}