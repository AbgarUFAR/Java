package bookexercises.loops;

import static utils.Input.scan;

public class Exercise19 {
    public static void main(String[] args) {
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = -n + i * 2; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((1 << j) + " ");
            }
            for (int j = i - 2; j > -1; j--) {
                System.out.print((1 << j) + " ");
            }
            System.out.println();
        }
    }
}
