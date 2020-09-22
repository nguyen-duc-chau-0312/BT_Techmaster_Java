package Bai6;

public class CardNumber {
    /*  "At, 2, 3, -> K
    Co ra ngau nhien 1 so tu 1 - 52
    Kiem tra so ngau nhien Random
    Neu random % 13 == 1 -- At
    Du 12 -- Q, Du 11 -- J, Du 0 == K, Du random -- > random
    Chat: random / 13
   */
    private String number;
    private int random;

    public int getRandom() {
        return random;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber() {
        int random = (int) (Math.random() * 52) + 1;
        if (random % 13 == 1) {
            number = "At";
        } else if (random % 13 == 12) {
            number = "Q";
        } else if (random % 13 == 11) {
            number = "J";
        } else if (random % 13 == 0) {
            number = "K";
        } else {
            number = Integer.toString(random % 13);
        }
    }

}

