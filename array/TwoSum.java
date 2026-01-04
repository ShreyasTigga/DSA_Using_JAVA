import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 5, 7, 4, 9};
        int target = 11;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("[" + map.get(complement) + ", " + i + "]");
            }

            map.put(nums[i], i);
        }
    }
}
