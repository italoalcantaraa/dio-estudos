package repetição;

public class BreakAndContinue {
    public static void main(String[] args) {
        // Break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i + " ( = ");
        }

        // Continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i + " ( = ");
        }
    }
}