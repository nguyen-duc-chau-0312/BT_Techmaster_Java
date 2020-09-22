package Bai4;

import java.util.Scanner;

public class Tamgiac {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a cua tam giac: ");
        a = scanner.nextDouble();
        System.out.print("Nhap canh b cua tam giac: ");
        b = scanner.nextDouble();
        System.out.print("Nhap canh c cua tam giac: ");
        c = scanner.nextDouble();
    }

    public String ChuVi() {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return "Chu vi cua tam giac la: " + (a + b + c);
        } else {
            return "Day khong phai ba canh cua tam giac, Moi ban nhap lai \n Tong chieu dai 2 canh phai lon hon canh con lai!";
        }
    }
}
