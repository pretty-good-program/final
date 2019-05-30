import java.util.Scanner;

public class Roulette
{
    public static void main(String[] args){
        int userEntry;
        String result;
        String result2 =null;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.\n");
        System.out.println("Its called Roulette\n");

        System.out.println("Enter an even or odd number >>>>>\n");
        userEntry = input.nextInt();

        if (userEntry % 2 == 0) {
            result = "number is Even";
        } else
            result = "number is Odd";

        System.out.println(result);

        System.out.println("Enter a number low number 1-18 or a high number 19-36 >>>>>\n");
        userEntry = input.nextInt();

        if(userEntry < 18) {
            result2 = "number is Low";
        }
        if(userEntry > 19) {
            result2 = "number is High";
        }

        System.out.println(result2);

        int random = (int) (Math.random() * 36);
        System.out.println("Spin the Wheel");

        if(userEntry == random){
            result ="You Win";
        }
        if(userEntry != random){
            result ="You Lose";
        }
        System.out.println(result);
    }
}
