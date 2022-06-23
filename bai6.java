import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so 3 chu so");
        a= sc.nextInt();
        System.out.println("so hang tram la :"+ (a/100));
        System.out.println("so hang chuc la :"+ ((a%100)/10));
        System.out.println("so hang don vi la :"+ (a%10));
        System.out.println("so dao nguoc là :"+ (a%10)+((a%100)/10)+(a/100));
        System.out.println("tong cac chu so là :"+((a%10)+((a%100)/10)+(a/100)));
    }
}
