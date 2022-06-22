import java.util.Scanner;

public class sinhvien {
    public static void main(String[] args) {
        int ma, sdt, tuoi;
        String ten, diachi, mail, gioitinh;
        Scanner sv = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien ");
        ma = Integer.parseInt(sv.nextLine());
        System.out.println("Nhap ten sinh vien ");
        ten = sv.nextLine();
        System.out.println("Nhap tuoi sinh vien ");
        tuoi = Integer.parseInt(sv.nextLine());
        System.out.println("Nhap diachi sinh vien ");
        diachi = sv.nextLine();
        System.out.println("Nhap gioitinh sinh vien ");
        gioitinh = sv.nextLine();
        System.out.println("Nhap sdt sinh vien \n");
        sdt = Integer.parseInt(sv.nextLine());
        System.out.println("Nhap mail sinh vien ");
        mail = sv.nextLine();
        System.out.println("Thong tin sinh vien la :");
        System.out.println("MaSV:" + ma);
        System.out.println("Ten sinh vien la:" + ten + "tuoi" + tuoi);
        System.out.println("Gioi tinh sinh vien " + gioitinh);
        System.out.println("dia chi " + diachi);
        System.out.println("so dien thoai" + sdt);
        System.out.println("mail" + mail);

    }
}
