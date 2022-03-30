package example01.g220329;

import java.util.Scanner;

public class Exam07 {

    public static void englishLearningProgram() {
        Scanner sc = new Scanner(System.in);

        // 한국어 영어 요일명 배열 입력 (0 : sunday ~ 6 : saturday)
        String[] yoilKor = {"일", "월", "화", "수", "목", "금", "토"};
        String[] yoilEng = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        System.out.println("요일명을 영어로 입력하시오.");

        for(;;) {
            int yoilNum = (int)(Math.random()*7);           // 랜덤 요일 생성 0 : sunday ~ 6 : saturday

            System.out.print(yoilKor[yoilNum] + "요일: ");   // 생성된 요일값에 대한 유저의 영문 입력
            String userInput = (sc.next()).toLowerCase();

            // 정답시
            if(userInput.equals(yoilEng[yoilNum])) {
                System.out.println("정답입니다. 다시한번? 1 (yes)/0 (no)");      // 0 아닌 숫자 입력시 반복
                if(sc.nextInt() == 0)
                    break;
            }

            // 오답시
            if(!userInput.equals(yoilEng[yoilNum])) {
                System.out.println("오답입니다. 다시한번? 1 (yes)/0 (no)");      // 0 아닌 숫자 입력시 반복
                if (sc.nextInt() == 0)
                    break;
            }
        }
    }

    public static void main(String[] args) {
        englishLearningProgram();
    }
}
