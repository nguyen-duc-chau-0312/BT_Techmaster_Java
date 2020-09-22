package Bai5;

import java.util.Scanner;

public class HinhChuNhat {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap toa do x: ");
        x = scanner.nextDouble();
        System.out.print("Nhap toa do y: ");
        y = scanner.nextDouble();
    }
    public String checkToaDo(){
        if ((-5 <= x && x <= 5) && (-2.5 <= y && y <= 2.5)) {
            return "Toa do " + "(" + x + " ," + y + ")" + " nam trong hinh chu nhat co tam tai (0,0)";
        } else {
            return "Toa do " + "(" + x + "," + y + ")" + " khong nam trong hinh chu nhat co tam tai (0,0)";
        }
    }

}
