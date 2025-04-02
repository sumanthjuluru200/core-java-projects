package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringLength {

    static int longestSubStringLength(String input) {
        int left = 0;
        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < input.length(); right++) {
            char c = input.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(map.get(c) + 1, left);
            } else {
                map.put(c, right);
                maxLength = Math.max(maxLength, right - left + 1);

            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "aabccbc";
        System.out.println(longestSubStringLength(input));
    }
}
