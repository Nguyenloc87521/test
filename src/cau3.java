import java.util.Random;
public class cau3 {


    public static void main(String[] args) {

        Random random = new Random();

       int number = random.nextInt();
        System.out.println("số nguyên "+ number);

        while(true) {
            if(isPrimeNumber(number)){
                System.out.println(number);
                number++;

            }

        }

    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
