package bookexercises.loops;

import static utils.Input.scan;

public class Exercise14 {
    public static void main(String[] args) {
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int d = Math.max(n1, n2);
        while (d > 0) {
            if (n1 % d == 0 && n2 % d == 0) {
                break;
            }
            d--;
        }
        System.out.println("gcd(" + n1 + ", " + n2 + ") = " + d);
        /**
         * I prefer Euclid's Algorithm :)
         */
        while (n2 > 0) {
            n1 %= n2;
            n1 ^= n2;
            n2 ^= n1;
            n1 ^= n2;
        }
        System.out.println("using Euclid's Algorithm the GCD is " + n1);
    }
}
