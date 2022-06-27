import java.util.Scanner;

public class lab2 {
    // public static void main(String[] args) {
    // int a, b, c, d;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Nhập lần lượt 4 số");
    // a = sc.nextInt();
    // b = sc.nextInt();
    // c = sc.nextInt();
    // d = sc.nextInt();
    // if (a > b && b > c && c > d) {
    // System.out.println("so lon nhat là" + a);
    // } else if (b > c && b > d && b > a) {
    // System.out.println("so lon nhat là" + b);
    // } else if (c > a && c > d && c > b) {
    // System.out.println("so lon nhat là" + c);
    // } else if (d > c && d > b && b > a) {
    // System.out.println("so lon nhat là" + d);
    // }
    // else {
    // System.out.println("Khong hop le");
    // }
    // }
    // public static void main(String[] args) {
    //     int thang, nam;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("nhap so thang ");

    //     thang = sc.nextInt();
    //     switch (thang) {
    //         case 1, 3, 5, 7, 8, 10:
    //             System.out.println("thang co 30 ngay");
    //             break;
    //         case 4, 6, 9, 11:
    //             System.out.println("thang co 31 ngay");
    //             break;
    //         case 2:
    //             System.out.println("nhap nam");
    //             nam = sc.nextInt();
    //             if (nam % 4 == 0) {
    //                 System.out.println("Nam nhuan");
    //                 System.out.println("thang co 29 ngay");
    //             } else {
    //                 System.out.println("nam khong nhuan");
    //                 System.out.println("thang co 28 ngay");
    //             }
    //             break;
    //     }
    // }
    public static void main(String[] args) {
        int sdc,sdm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien cu");
        sdc= sc.nextInt();
        System.out.println("nhap so dien moi");
        sdm= sc.nextInt();
        int tsd =sdm-sdc;
        System.out.println("so dien thang truoc là" +sdc);
        System.out.println("so dien thang nay là" +sdm);
        System.out.println("tong so dien su dung thang nay la" +tsd);
        int dm=tsd*230,vdm;
            // System.out.println("so tien định mức phai tra la " +dm);
            // vdm=sc.nextInt();
         if(50 <= vdm){
            System.out.println("so tien phai tra la "+((vdm*480)+dm));
        } else if(50>vdm&&100<vdm){
            System.out.println("so tien phai tra la "+((vdm*700)+dm));
        }

    }
}

