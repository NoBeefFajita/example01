package example01.a220318;

import java.util.Scanner;

public class Exam25 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            if (i == num) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
