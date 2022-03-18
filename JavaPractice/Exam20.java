package example01.JavaPractice;

import java.util.Scanner;

public class Exam20 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("============");
        System.out.println("합계: " + sum);
    }
}
