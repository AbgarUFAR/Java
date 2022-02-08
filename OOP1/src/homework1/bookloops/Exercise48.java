package homework1.bookloops;

import static homework1.utils.Input.scan;

public class Exercise48 {
    public static void main(String[] args) {
        System.out.print("Enter a string; ");
        String str = scan.nextLine();
        for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
    }
}
