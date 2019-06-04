import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoice;
        String result;
        String playAgain;
        int[] hitOrStay = {1, 2};
        int[] redCards = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        int[] blackCards = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        int[] allCards = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        Random rand = new Random();
        do {
            int total;
            int newTotal;
            int computerTotal;
            int newComputerTotal;
            int r = rand.nextInt(redCards.length);
            int b = rand.nextInt(blackCards.length);
            total = redCards[r] + blackCards[b];
            int cr = rand.nextInt(redCards.length);
            int cb = rand.nextInt(blackCards.length);
            computerTotal = redCards[cr] + blackCards[cb];
            System.out.println("The value of the red card is " + redCards[r]);
            System.out.println("The value of the black card is " + blackCards[b]);
            System.out.println("The total is " + total);
            System.out.println("The value of the red computer card is " + redCards[cr]);
            System.out.println("The value of the black computer card is " + blackCards[cb]);
            System.out.println("The computer total is " + computerTotal);
            System.out.println("Would you like to 1 for hit or 2 to stay? ");
            userChoice = input.nextInt();
            if (userChoice == 1) {
                int a = rand.nextInt(allCards.length);
                newTotal = allCards[a] + total;
                System.out.println("The value of the card is " + allCards[a]);
                System.out.println("The new total is " + newTotal);
            }
            System.out.println("Would the computer like to 1 for hit or 2 to stay? ");
            int hos = rand.nextInt(hitOrStay.length);
            if (hos == 1) {
                int ca = rand.nextInt(allCards.length);
                newComputerTotal = allCards[ca] + computerTotal;
                System.out.println("The value of the computer card is " + allCards[ca]);
                System.out.println("The new computer total is " + newComputerTotal);
            }
            if (total > 21) {
                System.out.println("You lose");
            } else if (total <= 21) {
                System.out.println("You win");
            }
            System.out.println("Would you like to play again yes or no? ");
            playAgain = input.next();
        }while (playAgain.equalsIgnoreCase("yes")) ;

    }
}
