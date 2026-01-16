import java.util.ArrayList;
import java.util.List;

public class RangeCounter {

    public static int countElementsWithRanges(List<Integer> arr, int length) {

        // List to store non-overlapping merged ranges
        List<int[]> ranges = new ArrayList<>();

        int count = 0;

        // i starts from 1 as per problem statement
        for (int i = 1; i <= length; i++) {

            int x = arr.get(i - 1);
            int k = i % 4;

            int start = x - k;
            int end = x + k;

            boolean insideExistingRange = false;
            boolean overlapped = false;

            for (int[] range : ranges) {

                // Case 1: element already inside a range
                if (range[0] <= x && x <= range[1]) {
                    insideExistingRange = true;
                    break;
                }

                // Case 2: overlapping ranges
                if (start <= range[1] && end >= range[0]) {
                    range[0] = Math.min(range[0], start);
                    range[1] = Math.max(range[1], end);
                    overlapped = true;
                    count++;
                    break;
                }
            }

            // Case 3: new independent range
            if (!insideExistingRange && !overlapped) {
                ranges.add(new int[]{start, end});
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(12);
        arr.add(15);
        arr.add(20);
        arr.add(22);

        int length = arr.size();

        int result = countElementsWithRanges(arr, length);

        System.out.println("Count = " + result);
    }
}
