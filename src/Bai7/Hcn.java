package Bai7;

import java.util.Scanner;

public class Hcn {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private String result;

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public String getResult() {
        return result;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap toa do x1, y1 cua hcn 1:");
        System.out.print("Toa do x1: ");
        x1 = scanner.nextDouble();
        System.out.print("Toa do y1: ");
        y1 = scanner.nextDouble();

        System.out.println("Moi ban nhap toa do x2, y2 cua hcn 2:");
        System.out.print("Toa do x2: ");
        x2 = scanner.nextDouble();
        System.out.print("Toa do y2: ");
        y2 = scanner.nextDouble();
    }

    public void checkHcn() {
        double checkX = (x1 + x2);
        double checkY = (y1 + y2) / 2;
        if (checkX <= checkY) {
            result = "\n Hai hinh chu nhat boc lay nhau";
        } else {
            result = "\n Hai hinh chu nhat nam ngoai nhau";
        }
    }
}
