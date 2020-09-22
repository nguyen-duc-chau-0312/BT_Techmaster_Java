package Bai3;

import java.util.Random;

public class RanDom_Month {
    private String number;
    private int random;

    public String getNumber() {
        return number;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom() {
        int random = (int) (Math.random() * 12) + 1;
        System.out.println(random);
        if (random == 1) {
            number = "Thang Mot!";
        } else if (random == 2) {
            number = "Thang Hai!";
        } else if (random == 3) {
            number = "Thang Ba!";
        } else if (random == 4) {
            number = "Thang Bon!";
        } else if (random == 5) {
            number = "Thang Nam!";
        } else if (random == 6) {
            number = "Thang Sau!";
        } else if (random == 7) {
            number = "Thang Bay!";
        } else if (random == 8) {
            number = "Thang Tam!";
        } else if (random == 9) {
            number = "Thang Chin!";
        } else if (random == 10) {
            number = "Thang Muoi!";
        } else if (random == 11) {
            number = "Thang Muoi Mot!";
        } else
            number = "Thang Muoi Hai!";
    }
}


