package Bai1;

import java.util.Scanner;

public class Year {
    private int n;
    private String year;

    public String getYear() {
        return year;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void checkYear() {
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            year = n + " la nam nhuan";
        } else {
            year = n + " khong la nam nhuan";
        }
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam ban can kiem tra: ");
        n = scanner.nextInt();
        while (true) {
            if (n > 0){
                break;
            }else{
                System.out.print("Ban nhap sai gia tri, nam phai lon hon 0 va la so nguyen \n Moi ban nhap lai:  ");
                n = scanner.nextInt();
            }
        }

    }

}
