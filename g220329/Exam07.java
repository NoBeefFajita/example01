package youngJun.java.day15.exam;

import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] yoilKor = {"일", "월", "화", "수", "목", "금", "토"};
        String[] yoilEng = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        System.out.println("요일명을 영어로 입력하시오.");

        for(;;) {
            int yoilNum = (int)(Math.random()*7); // 0 : sunday ~ 6 : saturday
            System.out.print(yoilKor[yoilNum] + "요일: ");
            String userInput = (sc.next()).toLowerCase();

            if(userInput.equals(yoilEng[yoilNum])) {
                System.out.println("정답입니다. 다시한번? 1 (yes)/0 (no)");
                boolean again = sc.nextInt() == 0;
                if(again)
                    break;
            }

            if(!userInput.equals(yoilEng[yoilNum])) {
                System.out.println("오답입니다. 다시한번? 1 (yes)/0 (no)");
                boolean again = sc.nextInt() == 0;
                if (again)
                    break;
            }
        }
    }
}
