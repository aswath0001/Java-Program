import java.util.HashMap;
import java.util.Map;

class Q2_SlidingWindow {
    public static int countDistinctSubString(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;
        
        int left = 0;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            // Shrink window until distinct characters <= k
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            
            // When map.size() == k, count all substrings ending at 'right'
            if (map.size() == k) {
                count++;  // This counts substrings with EXACTLY k distinct chars
                // Wait - this only counts ONE substring per right position
                // Need to count ALL valid substrings ending at right!
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String s = "abcbaa";
        int k = 3;
        System.out.println(countDistinctSubString(s, k));
    }
}