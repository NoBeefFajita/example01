package example01.JavaPractice;

import java.util.Scanner;

public class Exam16 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        if (num <= -10 || num >= 10)
            System.out.println("OK");
    }
}
