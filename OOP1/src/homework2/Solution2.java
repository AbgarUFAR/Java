package homework2;

import java.util.HashMap;
import java.util.Map;

import static utils.Input.scan;

/**
 * This solution uses the same idea like the Solution1's
 * but here theoretically our solution is faster, but
 * practically we have no guarantee, it depends on the
 * machine. The time complexity is amortized O(n) here
 * where n is the length of the initial array.
 */

public class Solution2 {
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            Integer val = count.get(arr[i]);
            if (val != null) {
                count.put(arr[i], ++val);
            } else {
                count.put(arr[i], 1);
            }
        }
        System.out.println(count);
    }
}
