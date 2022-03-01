package bookexercises.loops;

import static utils.Input.scan;

public class Exercise47 {
    public static void main(String[] args) {
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String num = scan.nextLine();
        if (num.length() == 12) {
            int d13 = 0;
            for (int i = 0; i < num.length(); i++) {
                d13 += ((num.charAt(i) - '0') * (i % 2 != 0 ? 3 : 1));
            }
            d13 = (10 - d13 % 10) % 10;
            System.out.println("The ISBN-13 number is " + num + d13);
        } else {
            System.out.println(num + " is an invalid input");
        }
    }
}
