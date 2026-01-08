import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNonRepeating {
    public static void main(String[] args) {

        String str = "abcabcbabcd";
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;
        int startIndex = 0;

        for (int right = 0; right < str.length(); right++) {

            // Shrink window until duplicate is removed
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            // Update max length and starting index
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                startIndex = left;
            }
        }

        System.out.println("Length: " + maxLen);
        System.out.println("Substring: " + str.substring(startIndex, startIndex + maxLen));
    }
}
