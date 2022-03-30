package example01.a220318;

import java.util.Scanner;

public class Exam34 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        // 1
        System.out.println(num + "의 절대값 : " + Math.abs(num));

        // 2
        if(num >= 0)
            System.out.println(num + "의 절대값 : " + num);
        else
            System.out.println(num + "의 절대값 : " + -num);
    }
}
