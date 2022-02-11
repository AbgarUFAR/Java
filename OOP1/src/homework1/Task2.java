package homework1;

import homework1.configs.Config;
import homework1.exceptions.InvalidBehaviorException;
import utils.Utility;

import static utils.Input.scan;

public class Task2 {
    public static void main(String[] args) {
        int numOfRightAns = 0;
        for (int i = 1; i <= Config.NUM_OF_QUESTIONS; i++) {
            int x = Utility.getRandomInt(1, 10);
            int y = Utility.getRandomInt(1, 10);
            System.out.print(i + ") " + x + " * " + y + " = ");
            int userAns = scan.nextInt();
            if (userAns == x * y) {
                numOfRightAns++;
            }
        }
        System.out.println("Your score: " + numOfRightAns + "/" + Config.NUM_OF_QUESTIONS);
        if (numOfRightAns == Config.NUM_OF_QUESTIONS) {
            System.out.println("Perfect");
        } else if (numOfRightAns == Config.NUM_OF_QUESTIONS - 1) {
            System.out.println("Good");
        } else if (numOfRightAns == Config.NUM_OF_QUESTIONS - 2 ||
                numOfRightAns == Config.NUM_OF_QUESTIONS - 3) {
            System.out.println("Not bad");
        } else if (numOfRightAns < Config.NUM_OF_QUESTIONS - 3 &&
                numOfRightAns >= 0) {
            System.out.println("Go learn");
        } else {
            throw new InvalidBehaviorException("Number of right answers cannot be greater than number of questions" +
                    "or lesser than 0");
        }
    }
}
