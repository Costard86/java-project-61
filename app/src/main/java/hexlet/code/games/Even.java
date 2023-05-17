package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static void even() {
        int maxRandom = 20;
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var attempts = 0;
        while (attempts < 3) {
            int random = 1 + (int) (Math.random() * maxRandom);
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
