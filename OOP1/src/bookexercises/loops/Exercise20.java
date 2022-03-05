package bookexercises.loops;

/**
 * O(n*log(log(n)))
 * Sieve of Eratosthenes
 */
public class Exercise20 {
    public static void main(String[] args) {
        int n = 1001;
        boolean prime[] = new boolean[n];

        /**
         * instead of wasting time on setting all values to 1
         * we could change all true values to false and
         * it would be more effective,
         * but setting all primes to true is much readable
         */
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2, j = 0; i < n; i++) {
            if (j == 8) {
                System.out.println();
                j = 0;
            }
            if (prime[i]) {
                System.out.printf("%3d\t", i);
                j++;
            }
        }
    }
}
