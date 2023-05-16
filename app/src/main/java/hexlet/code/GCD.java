package hexlet.code;
import java.util.Scanner;

public class GCD {
    public static void gcd() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        var attempts = 0;
        while (attempts < 3) {
            int randomNumb1 = 1 + (int) (Math.random() * 50);
            int randomNumb2 = 1 + (int) (Math.random() * 50);
            System.out.println("Question: " + randomNumb1 + " " + randomNumb2 + "\nYour answer: ");
            while (randomNumb1 != 0 && randomNumb2 != 0) {
                if (randomNumb1 > randomNumb2) {
                    randomNumb1 = randomNumb1 % randomNumb2;
                } else {
                    randomNumb2 = randomNumb2 % randomNumb1;
                }
            }
            int result = randomNumb1 + randomNumb2;

            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            if (number == result) {
                System.out.println("Correct!");
                attempts = attempts + 1;
            } else {
                System.out.println('\'' + Integer.toString(number) + '\'' + " is wrong answer ;(. Correct answer was "
                        + '\'' + result + '\'' + "\nLet's try again, " + name + '!');
                break;
            }
        }
        if (attempts > 2) {
            System.out.println("Congratulations, " + name + '!');
        }
    }
}
