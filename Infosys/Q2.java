import java.util.HashMap;
import java.util.Map;

class Q2{
    
    // Single pass O(n) - counts substrings with at most k distinct chars
    public static int atMostK(String s, int k) {
        if (k < 0) return 0;
        
        int left = 0;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            
            // Number of valid substrings ending at 'right'
            count += (right - left + 1);
        }
        return count;
    }
    
    // Exactly k = atMost(k) - atMost(k-1)
    public static int exactlyK(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }
    
    public static void main(String[] args) {
        String s = "abcbaa";
        int k = 3;
        
        int result = exactlyK(s, k);
        System.out.println("Exactly " + k + " distinct: " + result);
    }
}