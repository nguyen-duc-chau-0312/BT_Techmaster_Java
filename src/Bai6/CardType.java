package Bai6;

public class CardType {
    private String cardType;
    private int number;

    public String getCardType() {
        return cardType;
    }

    public CardType(int number) {
        this.number = number;
    }

    public void setCardType() {
        if (number / 13 == 0) {
            this.cardType = "Co";
        } else if (number / 13 == 1) {
            this.cardType = "Ro";
        } else if (number / 13 == 2) {
            this.cardType = "Tep";
        } else if (number / 13 == 3) {
            this.cardType = "Bich";
        }

    }
}
