package example01.a220318;

import java.util.Scanner;

public class Exam18 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        if (num < -10) {
            System.out.println("range 1");
        } else if (num < 0) {
            System.out.println("range 2");
        } else {
            System.out.println("range 3");
        }
    }
}
