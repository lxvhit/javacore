import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a");
        a =sc.nextInt();
        System.out.println("Nhập số nguyên b");
        b=sc.nextInt();
        int tong =a+b;
        System.out.println("TOng cua "+a+" và "+b+" là" + tong);
    }
    
}
