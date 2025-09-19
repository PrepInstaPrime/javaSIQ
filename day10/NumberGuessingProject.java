import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class NumberGuessingProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name + " to the Number Guessing Game!🔥🔥🔥🔥");
        System.out.println("Rules: \n1. You have to guess a number between 1 to 100. \n2. You have 10 attempts to guess the correct number. \n3. After each guess, you will be told if your guess is too high or too low.");
        System.out.println("Let's start the game! 🎉🎉🎉");
        System.out.println("Enter your first guess: ");
        int guess = sc.nextInt();
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int attempts = 10;
        int score = 0;
        while (guess!= numberToGuess && attempts > 1) {
            if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again! ⬆️");
            } else {
                System.out.println("Your guess is too high. Try again! ⬇️");
            }
            attempts--;
            score++;
            System.out.println("You have " + attempts + " attempts left.");
            System.out.println("Enter your next guess: ");
            guess = sc.nextInt(); 
        }
        if (guess == numberToGuess) {
            System.out.println("Congratulations " + name + "! You've guessed the correct number " + numberToGuess + ". 🎉🎉🎉");
            System.out.println("Your score is: " + score);
            File file = new File("score.txt");
            try {
                FileWriter writer = new FileWriter(file, true);
                writer.write("Player: " + name + "\n");
                writer.write("Score: " + score + "\n");
                writer.close();
            } catch (Exception e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("Sorry " + name + ", you've used all your attempts. The correct number was " + numberToGuess + ". Better luck next time! 🍀");
        }

    }
}
