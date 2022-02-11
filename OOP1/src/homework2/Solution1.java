package homework2;

import static utils.Input.scan;

/**
 * This Solution uses the technique of counting/indexing
 * which is also popular in counting sort.
 * This works in O(2n + m) where n is the length of the
 * initial array and m is the difference of its maximum
 * and minimum values. This solution's Big-Oh is bigger
 * than the Solution2's, but this might work faster than
 * the next solution because of caches.
 */

public class Solution1 {
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int range = max - min + 1;
        int[] count = new int[range];
        for (int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }
        for (int i = 0; i < range; i++) {
            if (count[i] != 0) {
                System.out.println(i + min + " - " + count[i]);
            }
        }
    }
}
