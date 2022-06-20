import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class binhphuong {
    public static void main(String[] args) {
        int a;
        Scanner bp = new Scanner(System.in);
        
        System.out.println("Nhap so a");
        a = bp.nextInt();
        int tongbp= a*a;
        System.out.println("Binh phuong so" + a+ " là " + tongbp);
    }
}
