public class Graphics {

    public static void displayGraphics() throws InterruptedException {
        System.out.print("#####################################################\n\n\n\n\n\n");
        System.out.print("#####################################################\n\n\n\n\n\n");
        System.out.print("#####################################################\n\n\n\n\n\n");
        for(int i = 0; i<7; i++){
            Thread.sleep(350);
            System.out.print(" . ");
        }
        System.out.print(".\n\n");
    }
}
