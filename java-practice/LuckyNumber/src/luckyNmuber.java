import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class luckyNmuber {
    /* secretNumber is a random number from 0 to maximum
    * player put in guessNumber
    * vairable  count is counting each time player put in guessNumber
    * if guessNumber > secretNumber print out "Lucky number is less than your guess number"
    * If guessNumber < secretNumber print out "Luck number is greater than your guess number"
    * if guessNumber = secretNumber print out "Congratulation, after x times guessing,
    * your guessing number same as lucky number"
    * Advance
    *  after player win print out asking "are you want to play again? (y/n)" ignore case sensitive
    *  answer  "y" start play again, "n" stop the game and print out total game player was play,
    *
    *
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // set boolean to game playing
        boolean playAgain = true;
        // game loop
        while(playAgain) {
            // random number from 0 - 100
            int secretNum = rand.nextInt(101);
            // avairable number for player put in
            int guessNum = 0;
            // avairable to put in counting play times
            int count = 0;
            //asking player to put in guessNum
            System.out.println("I am thinking of a number from 1 to 100");
            System.out.print("guess what it is ? ");
            // number guessing loop
            while (guessNum != secretNum) {
                guessNum = sc.nextInt();
                // each time player put in number count increase 1
                count++;
                // compare if number player put in lower than lucky number & ask for put in again
                if (guessNum < secretNum) {
                    System.out.println("Luck number is higher than your guess number");
                    System.out.print("guess again: ");
                    // compare if number player put in higher than lucky number & ask for put in again

                } else if (guessNum > secretNum) {
                    System.out.println("Luck number is lower than your guess number");
                    System.out.print("guess again: ");

                }
            }// when guessNum = secretNum, end guessing loop
            System.out.println("Congratulations. You guessed the number with "
                    + count + " tries!");
            // asking if player want to play game again
            System.out.println("Do you want to play again? (y/n)");
            String again = sc.next();
            //
            if(again.toLowerCase().charAt(0) == 'y'){
                // run game again
                playAgain = true;
            }else{
                // end game loop
                playAgain = false;
            }
        }System.out.println("Have a nice day");
    }
}

