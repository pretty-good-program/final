import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) throws InterruptedException {
        Wallet wallet1 = new Wallet();
        System.out.println("Your current cash is " + wallet1.getTotalWallet());
        String result = null;
        String userChoice;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the one armed bandit; Have the chance to win 5000 dollars.");
        do{
            Graphics.displayGraphics();
            int random = (int) (Math.random() * 10);
            int random2 = (int) (Math.random() * 10);
            int random3 = (int) (Math.random() * 10);
            if (random == random2 && random2 == random3) {
                result = "You win the result is " + random + " " + random2 + " " + random3 + "\n\n\nYour current cash is";
                wallet1.setWonMoney(5000);
            }
            else if(random - 1 == random2 && random2 - 1 == random3){
                result = "You win the result is " + random + " " + random2 + " " + random3 + "\n\n\nYour current cash is";
                wallet1.setWonMoney(5000);
            }
            else if(random + 1 == random2 && random2 + 1 == random3){
                result = "You win the result is " + random + " " + random2 + " " + random3 + "\n\n\nYour current cash is";
                wallet1.setWonMoney(5000);
            }
            else if (random != random2 && random2 != random3) {
                result = "You lose the result is " + random + " " + random2 + " " + random3 + "\n\n\nYour current cash is";
                wallet1.setLoseWallet(10);
            }

            System.out.println(result + " " + wallet1.getTotalWallet());
            System.out.println("Would you like to quit or play again?");
            userChoice = input.next();
        }while(!userChoice.equals("quit"));
    }
}