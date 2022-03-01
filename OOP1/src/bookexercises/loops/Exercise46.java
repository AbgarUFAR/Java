package bookexercises.loops;

import static utils.Input.scan;

public class Exercise46 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        str = new StringBuilder(str).reverse().toString();
        System.out.println("The reversed string is " + str);
    }
}
