import java.util.Scanner;
public class cau4 {
    public static void main(String[] args) {
        int n;
        n = new Scanner(System.in).nextInt();
        int count = 0;
        int x =2;
        while(true ){
            if(isPrimeNumber(x)){
                System.out.print(x+" ");
                count++;
            }
            if(count == n){
                break;
            }
            if(x==2)
              x++;
            else {
                x+=2;
            }
            for (int i=0; i<10;i++){
                System.out.print(i);
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
