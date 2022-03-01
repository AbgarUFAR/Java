package bookexercises.loops;

import static utils.Input.scan;

public class Exercise17 {
    public static void main(String[] args) {
        int n = scan.nextInt();
        // if the value of n is so big we can use StringBuilder
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            for (int k = 0; k < n - 1 - i; k++) {
                System.out.print("  ");
            }
            System.out.print(j);
            for (int k = j - 1; k >= j - i; k--) {
                System.out.print(" " + k);
            }
            for (int k = 2; k <= j; k++) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
}
