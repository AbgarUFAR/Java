package homework1.bookloops;

import static homework1.utils.Input.scan;

public class Exercise51 {
    public static void main(String[] args) {
        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();
        int minLen = Math.min(str1.length(), str2.length());
        int ptr = 0;
        for (; ptr < minLen; ptr++) {
            if (str1.charAt(ptr) != str2.charAt(ptr)) {
                break;
            }
        }
        if (ptr == 0) {
            System.out.println(str1 + " and " + str2 + " have no common prefix");
        } else {
            System.out.println("The common prefix is " + str1.substring(0, ptr));
        }
    }
}
