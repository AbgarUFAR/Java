package bookexercises.loops;

import static utils.Input.scan;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int num = -1;
        int numOfNegatives = 0;
        int numOfPositives = 0;
        int sum = 0;
        while (num != 0) {
            num = scan.nextInt();
            if (num < 0) {
                numOfNegatives++;
            } else if (num > 0) {
                numOfPositives++;
            }
            sum += num;
        }
        int total = numOfNegatives + numOfPositives;
        if (total == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The number of positives is " + numOfPositives);
            System.out.println("The number of negatives is " + numOfNegatives);
            System.out.println("The total is " + total);
            System.out.println("The average is " + ((double) sum / total));
        }
    }
}
