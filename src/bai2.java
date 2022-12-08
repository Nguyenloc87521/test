import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi :");
        String string = sc.nextLine();
        System.out.print("Ký tự cần đếm : ");
        char ch=(char) sc.next().charAt(0);
        int number=0;
        for(int i=0;i<string.length();i++)
            if(ch==string.charAt(i)) number++;
        System.out.println("số lần xuất hiện "+ch+": "+number);
    }
}
