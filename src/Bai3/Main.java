package Bai3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RanDom_Month rd = new RanDom_Month();
        rd.setRandom();
        System.out.println("Day la thang : " + rd.getNumber());

    }
}
