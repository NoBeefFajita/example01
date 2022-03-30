package example01.a220318;

import java.util.Scanner;

public class Exam32 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력: ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int num2 = sc.nextInt();

        System.out.println("합 : " + (num1 + num2));
        System.out.println("차 : " + (num1 - num2));
        System.out.println("몫 : " + (num1 / num2));
        System.out.println("나머지 : " + (num1 % num2));

    }
}
