package ex_11_while;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToguess = random.nextInt(50) + 1;
        //System.out.println(numberToguess); ---- In this case guess number will come

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempt = 0;
        while (true) {
            guess = scanner.nextInt();
            attempt++;

            if (guess < numberToguess) {
                System.out.println("too low");
            } else if (guess > numberToguess) {
                System.out.println("too high");
            } else {
                System.out.println("correct " + attempt + " attempt");
                break;
            }
        }
    }
}

