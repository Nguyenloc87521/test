
public class cau1 {
    public static void main(String[] args) {
        hinhTamGiac(4, 4);
        System.out.println();


    }
    public static void hinhTamGiac(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
