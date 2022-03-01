package bookexercises.loops;

public class Exercise15 {
    public static void main(String[] args) {
        for (char i = '!', j = 0; i <= '~'; i++, j++) {
            if (j == 10) {
                System.out.println();
                j = 0;
            }
            System.out.print(i + " ");
        }
    }
}
