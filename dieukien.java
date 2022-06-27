import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
import javax.lang.model.util.ElementScanner14;


public class dieukien {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a,b,c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b && b==c && a==c){
            System.out.println("tam giac deu");
        }
        else if(a==b || b==c || a==c) {
            System.out.println(" tam giac cân");
        }
        else {
        System.out.println("deo phai tam giac");
        }

    }
}
