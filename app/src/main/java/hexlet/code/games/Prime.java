package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    private static final int ROUND_COUNT = 3;
    private static final int RANDOM_NUMBER = 80;
    public static void prime() {
        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var attempts = 0;
        while (attempts < ROUND_COUNT) {
            int number = 1 + (int) (Math.random() * RANDOM_NUMBER);
            String correctAnswer = "yes";
            if (number < 2) {
                correctAnswer = "no";
            }
            var divider = 2;
            while (divider <= number / 2) {
                if (number % divider == 0) {
                    correctAnswer = "no";
                }
                divider++;
            }
            String answer = Integer.toString(number);
            String result = Engine.game(answer, correctAnswer);
            if (result.equals("Correct!")) {
                attempts++;
            } else {
                System.out.println(result);
                break;
            }
        }
        if (attempts > 2) {
            System.out.println("Congratulations, " + Engine.name + '!');
        }
    }
}
