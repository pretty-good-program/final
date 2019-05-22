public class SlotMachine
{
    public static void main(String[] args){
        String result ="You win";
        int random = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);
        int random3 = (int) (Math.random() * 10);

        if( random == random2 && random2 == random3 ){
            result = "You win";
        }
        if( random != random2 && random2 != random3) {
            result = "You lose";
        }
        System.out.println(result);
    }
}
