package example01.a220318;

import java.util.Scanner;

public class Exam23 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
