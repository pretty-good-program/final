import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        String result = "You win";
        int totalMoney;
        int wallet;
        Wallet wallet1 = new Wallet();
        String userChoice;
        Scanner input = new Scanner(System.in);
        do{
            int random = (int) (Math.random() * 10);
            int random2 = (int) (Math.random() * 10);
            int random3 = (int) (Math.random() * 10);

            if (random == random2 && random2 == random3) {
                result = "You win";
                wallet1.setWonMoney(10);
            }
            if (random != random2 && random2 != random3) {
                result = "You lose";
                wallet1.setLoseWallet(10);
            }

            System.out.println(result + " " + wallet1.getTotalWallet());

            System.out.println("Would you like to quit or play again?");
            userChoice = input.toString();
        }while(userChoice.equals("quit"));
    }
}