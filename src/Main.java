import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        int out = 0;

        for (int i = 0; i<7; i++){
                num += d5();
            System.out.println(num);
            }

        

        System.out.println(out);
    }

    public static int d5() {
        Random rand = new Random();
        return rand.nextInt(5)+1;
    }
}