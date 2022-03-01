package bookexercises.loops;

import static utils.Input.scan;

public class Exercise18 {
    public static void main(String[] args) {
        int n = scan.nextInt();
        System.out.println("Pattern A");
        // if the value of n is so big we can use StringBuilder
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern B");
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern C");
        for (int i = 1; i <= n; i++) {
            int j;
            for (j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (;j > n - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
