package mehtodsWithReturn;

import java.util.*;

public class GuessTheNUmber {
    public static void main(String[] args) {
        //playGuessNumComputerOnly();
        playGuessNumWithLimit(3);
    }

    //playGuessNumComputerOnly()
    //playGuessNumWithLimit(int limit)
    //playGuessNumComputerAndMe(int secretNum)

    public static void playGuessNumComputerOnly() {
        Random random = new Random();
        int secretNumber = random.nextInt(21);
        int counter =0;
        do {
            counter++;
            System.out.println("Guess the secret number:");
            int guessNumber = random.nextInt(21);
            System.out.println("Guessing :" + guessNumber + " Counter: " + counter);
            //Check if secret number matches guessNumber
            if (guessNumber == secretNumber){
                System.out.println("You won! Guessed secret number");
                break;
            }else {
                System.out.println("Wrong! Try again");
            }


        }while (true);
    }
    public static void playGuessNumWithLimit(int limit){
        Random random = new Random();
        int secretNumber = random.nextInt(10);
        int counter =0;
        do {
            counter++;
            System.out.println("Guess the secret number:");
            int guessNumber = random.nextInt(21);
            System.out.println("Guessing :" + guessNumber + " Counter: " + counter);
            //Check if secret number matches guessNumber
            if (guessNumber == secretNumber){
                System.out.println("You won! Guessed secret number");
                break;
            }else {
                System.out.println("Wrong! Try again");
            }
            if (counter==limit){
                System.out.println("You lost");
                break;
            }



        }while (true);

    }
}
