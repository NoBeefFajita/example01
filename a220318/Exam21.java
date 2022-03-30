package example01.JavaPractice;

import java.util.Scanner;

public class Exam21 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        int fac = 1;

        for(int i = 1; i <= num; i++) {
            fac *= i;
        }

        System.out.println("============");
        System.out.println("계승 : " + fac);
    }
}
