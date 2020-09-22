package Bai6;

import java.util.Random;


public class Main {
    /*
       6. Viết chương trình mô phỏng việc lấy ngẫu nhiên một lá bài từ bộ bài 52 lá và
           chương trình phải hiển thị lá bài đó là lá bài gì. Ví dụ đầu ra của chương trình như sau:
            "Lá bài bạn vừa rút ra là Q cơ"
        */
   /*  "At, 2, 3, -> K
     Co ra ngau nhien 1 so tu 1 - 52
     Kiem tra so ngau nhien Random
     Neu random % 13 == 1 -- At
     Du 12 -- Q, Du 11 -- J, Du 0 == K, Du random -- > random
     Chat: random / 13
cardNumber.getNumber()
    */

    public static void main(String[] args) {
        CardNumber cardNumber = new CardNumber();
        cardNumber.setNumber();
        CardType cardType = new CardType(cardNumber.getRandom());
        cardType.setCardType();
        System.out.println("Quan bai la " + cardNumber.getNumber() + " " + cardType.getCardType());

    }
}
