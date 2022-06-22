import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int a,b;
        Scanner hoang = new Scanner(System.in);

        System.out.println("nhap so a");
        a = hoang.nextInt();
        System.out.println("nhap so b");
        b=hoang.nextInt();
        System.out.println("Tong la :"+(a+b));
        System.out.println("Hieu la :"+(a-b));
        System.out.println("Thuong la :"+(a*b));
        System.out.println("Tich la :"+(a/b));
    }
}
