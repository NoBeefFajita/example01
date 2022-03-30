package example01.b220318;

import java.util.Scanner;

public class ExerciseArray02 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];                    // 배열 선언

        for (int i = 0; i < num.length; i++) {      // 숫자 입력
            System.out.print("숫자 입력: ");
            num[i] = sc.nextInt();
        }

        System.out.println("==========");

        System.out.print("짝수: ");                 // 짝수 출력
        for (int j : num) {
            if (j % 2 == 0)
                System.out.print(j + " ");
            else
                continue;
        }

        System.out.print("\n홀수: ");                 // 홀수 출력
        for (int j : num) {

            if (j % 2 == 0)
                continue;
            else
                System.out.print(j + " ");
        }
    }
}

