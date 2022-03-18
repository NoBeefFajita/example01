package example01.JavaPractice;

import java.util.Scanner;

public class Exam15 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        if (num > 5 && num < 20)
            System.out.println("OK");
    }
}
