package example01.d220323;

public class Exam03 {
    public static void payBead(int price) {
        int bead1000 = price / 1000;
        int bead100;

        if (price % 1000 % 100 == 0)
            bead100 = (price % 1000) / 100;
        else
            bead100 = (price % 1000) / 100 + 1;

        System.out.println("1000원 구슬: " + bead1000 + "개"
                         + " 100원 구슬: " + bead100 + "개");
    }

    public static void main(String[] args) {
        payBead(9550);
    }
}
