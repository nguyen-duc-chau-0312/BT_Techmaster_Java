package Bai2;

import java.util.Scanner;

public class TinhToan {
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

    public void check() {
        switch (n) {
            case 0:
                year = "Ty";
                break;
            case 1:
                year = "Suu";
                break;
            case 2:
                year = "Dan";
                break;
            case 3:
                year = "Mao";
                break;
            case 4:
                year = "Thin";
                break;
            case 5:
                year = "Ty.";
                break;
            case 6:
                year = "Ngo";
                break;
            case 7:
                year = "Mui";
                break;
            case 8:
                year = "Than";
                break;
            case 9:
                year = "Dau";
                break;
            case 10:
                year = "Tuat";
                break;
            case 11:
                year = "Hoi";
                break;
            default:
                System.out.println("Khong hop le!");

        }

    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap nam can kiem tra: ");
        n = scanner.nextInt();
        while (true) {
            if (n >= 0 && n <= 11) {
                break;
            } else {
                System.out.print("Nam kiem tra trong khoang tu 0 - 11 \n Moi ban nhap lai: ");
                n = scanner.nextInt();
            }
        }
    }
}
