package example01.thirdPractice;

import java.util.Scanner;

public class ExerciseArray03 {

    public static void main(String...args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("첫번째 숫자 입력: ");        // 1~9 사이 숫자 입력
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자 입력: ");
            int num2 = sc.nextInt();

            if (num1 > 9 || num1 < 1 || num2 > 9 || num2 < 1){
                System.out.println("1~9 사이의 숫자를 입력하시오");
                return;
            }

        int[][] gugudan = new int[10][10];          // 구구단 저장할 2차원 배열 생성 및 초기화

        for(int i = 0; i < 10; i++){
            if(i==0) continue;
            for(int j = 0; j < 10; j++){
                gugudan[i][j] = i * j;
            }
        }

        System.out.println(num1 + " * " + num2 + " = " + gugudan[num1][num2]);
    }
}
