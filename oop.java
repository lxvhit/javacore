import java.time.chrono.ThaiBuddhistDate;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class oop {
    private String employeeId;
    private String employeeName;
    private int age;
    private float rate;
    private float salery;
    private boolean employeeStatus;

    public oop() {
    }

    public oop(String employeeId, String employeeName, int age, float rate, float salery, boolean employeeStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.rate = rate;
        this.salery = salery;
        this.employeeStatus = employeeStatus;

    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Float getRate() {
        return this.rate;
    }

    public void setSalery(Float salery) {
        this.salery = salery;
    }

    public Float getSalery() {
        return this.salery;
    }

    public void setEmployeeStatus(Boolean EmployeeStatus) {
        this.employeeStatus = EmployeeStatus;
    }

    public boolean getEmployeeStatus() {
        return this.employeeStatus;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien :");
        employeeId = sc.nextLine();
        System.out.print("Nhap ten nhan vien :");
        employeeName = sc.nextLine();
        System.out.print("Nhap tuoi nhan vien :");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap trang thai nhan vien :");
        employeeStatus = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhap rate nhan vien :");
        rate = (sc.nextFloat());
    }

    public void displayData() {
        System.out.println("ma nhan vien :" + employeeId);
        System.out.println("ten nhan vien :" + employeeName);
        System.out.println(" rate nhan vien :" + rate);
        System.out.println(" trang thai nhan vien :" + employeeStatus);

    }

    public void calSalary() {
        salery = rate * 1300000;
        System.out.println("tong luong : " + salery);
    }
}