package example01.a220318;

import java.util.Scanner;

public class Exam17 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        if ((num >= -10 && num < 0)|| num >= 10)
            System.out.println("OK");
        else
            System.out.println("NG");

    }
}
