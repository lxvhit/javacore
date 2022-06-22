import java.util.Scanner;

public class diem {
    public static void main(String[] args) {
        int toan,ly,hoa;
        Scanner diem = new Scanner  (System.in);
        System.out.println("nhap diem toan: " );
        toan = diem.nextInt();
        System.out.println("nhap diem ly");
        ly= diem.nextInt();
        System.out.println("nhap diem hoa" );
        hoa=diem.nextInt();
        double dtb = ((toan+ly+hoa)/3);
        System.out.println("diem trung binh la" + dtb);
    }
}
