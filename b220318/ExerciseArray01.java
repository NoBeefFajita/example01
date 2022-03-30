package example01.b220318;

import java.util.Scanner;

public class ExerciseArray01 {

    public static void main(String...args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];                        // 배열 생성

        for(int i = 0; i < num.length; i++) {           // 숫자 입력
            System.out.print("숫자 입력: ");
            num[i] = sc.nextInt();
        }

        for(int i = num.length-1; i >= 0; i--) {        // 역순 출력
            System.out.println("숫자 출력: "  + num[i]);
        }

    }
}
