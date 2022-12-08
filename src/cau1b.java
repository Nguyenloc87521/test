public class cau1b {
    public static void main(String[] args) {
        hinhVuong(4, 4);
        System.out.println();


    }
    public static void hinhVuong(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
