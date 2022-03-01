package bookexercises.loops;

import static utils.Input.scan;

public class Exercise44 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        short num = scan.nextShort();
        System.out.print("The bits are ");
        for (int i = 16; i >= 0; i--) {
            if ((num & (1 << i)) != 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}
