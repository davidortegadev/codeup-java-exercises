import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        startGame();

        System.out.println("Would you like to try again?");
        Scanner scan = new Scanner(System.in);
        String continueGame = scan.next();
        while (continueGame.contains("y")) {
            startGame();
        }
    }

    public static void startGame() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("The computer has picked a random number between 1 and 100. " +
                "Guess that number within 10 tries to win!");
        for(int i = 1; i<10; i++) {
            System.out.println("Please choose your number. This is try number: "+i+".");
            Scanner scanner = new Scanner(System.in);
            int userGuess = scanner.nextInt();
            if(userGuess>randomNumber){
                System.out.println("Your guess was too high...");
            } else if(userGuess<randomNumber){
                System.out.println("Your guess was too low...");
            } else {
                System.out.println("Your guess was right on the money! Congrats!");
                i=10;
            }
        }
        System.out.println("Game over!");
    }
}
