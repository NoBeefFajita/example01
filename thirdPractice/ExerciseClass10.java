package example01.thirdPractice;

import java.util.Scanner;

public class ExerciseClass10 {

    public static void main(String[] args) {

        CoinCase cc = new CoinCase();
        Scanner sc = new Scanner(System.in);

        int[] coin = cc.coin;

        for (int i = 0; i < 10; i++) {          // addCoins 메소드로 동전 추가 10회
            System.out.println((i + 1) + "번째 입금$");
            System.out.print("동전 종류: ");
            int type = sc.nextInt();
            System.out.print("동전 갯수: ");
            int number = sc.nextInt();

            cc.addCoins(type, number);
            System.out.println();
        }

        System.out.println();
        System.out.println("===== 지갑 현황 =====");

        for (int i : coin) {
            System.out.println(i + "원 : " + cc.getCount(i) + "개");  // 동전 갯수 나열
        }

        System.out.println();
        System.out.println("총액 : " + cc.getAmount() + "원");        // 총액
    }


    // Coin Case 클래스 선언
    public static class CoinCase {

        int[] type = new int[6];                        // 배열 선언 {1원, 5원, 10원, 50원, 100원, 500원}
        int[] coin = {1, 5, 10, 50, 100, 500};

        public void addCoins(int ct, int cn) {

            for (int i = 0; i < type.length; i++) {     // 동전 분류 및 추가
                if (ct == coin[i]) {
                    type[i] += cn;
                    return;
                }
            }
            System.out.println("유효하지 않은 동전 종류");
        }

        public int getCount(int ct) {
            for (int i = 0; i < type.length; i++) {     // 동전 갯수 리턴
                if (ct == coin[i])
                    return type[i];
            }
            System.out.println("유효하지 않은 동전 종류");
            return 0;
        }


        public int getAmount() {

            int total = 0;

            for (int i = 0; i < type.length; i++) {     // 동전 총액
                total += type[i] * coin[i];
            }
            return total;
        }
    }
}
