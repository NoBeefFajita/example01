package example01.b220318;

import java.util.Scanner;

public class ExerciseMethod07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        // 숫자 입력
        System.out.print("숫자 입력: ");
        int num = sc.nextInt();

        triangle(num);                             // 삼각형 만들기 메소드
    }

    static void triangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 3 + i; j++) {
                for (int h = 0; h <= j; h++) {
                    System.out.print("$");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
