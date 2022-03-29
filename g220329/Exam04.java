package example01.g220329;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random()*90)+10;
        int userNum;
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자맞추기 게임 시작!");
        System.out.println("10부터 99까지 숫자를 맞추세요");

        do{
            System.out.print("어떤 숫자일까? ");
            userNum = sc.nextInt();

            if (randomNum > userNum)
                System.out.println("더 큰 숫자입니다.");
            else if (randomNum < userNum)
                System.out.println("더 작은 숫자입니다.");
            else {
                System.out.println("정답입니다.");
                break;
            }
        } while (true);
    }
}
