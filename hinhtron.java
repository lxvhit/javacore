import java.util.Scanner;

public class hinhtron {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner ht = new Scanner(System.in);
        System.out.println("Nhập đường kính kình tròn");
        r = ht.nextInt();
        double c= 2*r*pi;
        System.out.println("chu vi hinh tron là" +c);
        double s= r*r*pi;
        System.out.println("dien tich hinh tron là" +s);
    }
}
