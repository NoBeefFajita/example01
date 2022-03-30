package example01.g220329;

import java.util.Random;
import java.util.Scanner;

public class Exam07a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 한국어 영어 요일명 배열 입력 (0 : sunday ~ 6 : saturday)
        String[] yoilKor = {"일", "월", "화", "수", "목", "금", "토"};
        String[] yoilEng = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        int retry;
        int last = -1;
        int yoilNum;

        do {
            do {
                yoilNum = random.nextInt(7);        // 랜덤 요일 생성 0 : sunday ~ 6 : saturday
            } while(yoilNum == last);

            last = yoilNum;                                 // 이전 요일과 중복 방지

            System.out.println("요일명을 영어로 입력하시오.");

            do {
                System.out.print(yoilKor[yoilNum] + "요일: ");

                if(sc.next().toLowerCase().equals(yoilEng[yoilNum]))
                    break;
                else
                    System.out.println("오답입니다.");
            } while(true);

            do {
                System.out.print("정답입니다. 다시한번? 1(Yes)/0(No) ");
                retry = sc.nextInt();
            } while(retry != 0 && retry != 1);

        } while(retry == 1);
    }
}
