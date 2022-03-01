package bookexercises.loops;

import static utils.Input.scan;

public class Exercise16 {
    public static void main(String[] args) {
        /**
         * O(n^(1/2) * log(n))
         */
        int n = scan.nextInt();
        int m = n; // for the next solution
        StringBuilder sb = new StringBuilder();
        while (n % 2 == 0) {
            sb.append(2).append(' ');
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                sb.append(i).append(' ');
                n /= i;
            }
        }
        if (n > 2) {
            sb.append(n);
        }
        System.out.println(sb.toString());
        /**
         * But since composite numbers are a lot
         * we can use this algorithm which works
         * in O(log n) time complexity, but for
         * prime numbers it works in O(n)
         */
        for (int i = 2; m > 2;) {
            if (m % i == 0) {
                System.out.println(i);
                m /= i;
            } else {
                i++;
            }
        }
    }
}
