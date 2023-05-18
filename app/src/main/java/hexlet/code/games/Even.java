package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    private static final int ROUND_COUNT = 3;
    private static final int RANDOM_NUMBER = 20;
    public static void even() {
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var attempts = 0;
        while (attempts < ROUND_COUNT) {
            int random = 1 + (int) (Math.random() * RANDOM_NUMBER);
            var correctAnswer = "";
            if (random % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            String answer = String.valueOf(random);
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
