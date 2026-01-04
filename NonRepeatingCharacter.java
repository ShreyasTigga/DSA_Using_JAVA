import java.util.HashMap;

class NonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "aabbcdde";
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Frequency count
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
