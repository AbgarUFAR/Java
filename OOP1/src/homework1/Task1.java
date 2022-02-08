package homework1;

import homework1.configs.Config;
import homework1.utils.Utility;

import static homework1.utils.Input.scan;

public class Task1 {
    public static void main(String[] args) {
        int randomNum = Utility.getRandomInt(0, 100);
        int numOfTries = Config.TOTAL_NUM_OF_TRIES;
        System.out.println("\t\tGuess the random generated number");
        boolean hasWon = false;

        while (numOfTries > 0) {
            System.out.println("You have " + numOfTries-- + " out of " +
                    Config.TOTAL_NUM_OF_TRIES + " tries");
            int choice = scan.nextInt();
            if (choice == randomNum) {
                System.out.println("You've guessed it right!");
                hasWon = true;
                break;
            }
            System.out.println("You didn't guess the number");
        }
        if (!hasWon) {
            System.out.println("You failed");
        }
        scan.close();
    }
}
