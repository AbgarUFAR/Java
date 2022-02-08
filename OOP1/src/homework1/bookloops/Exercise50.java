package homework1.bookloops;

import static homework1.utils.Input.scan;

public class Exercise50 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("The number of uppercase letters is " + count);
    }
}
