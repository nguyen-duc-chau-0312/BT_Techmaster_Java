package Bai8;

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set set1 = new Set((byte)1);
        Set set2 = new Set((byte)2);
        Set set3 = new Set((byte)4);
        Set set4 = new Set((byte)8);
        Set set5 = new Set((byte)16);

        System.out.print("Ngay sinh cua ban cua nam trong set1?\n");
        System.out.print(set1.getSet());

    }

}
