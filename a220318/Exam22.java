package example01.a220318;

import java.util.Scanner;

public class Exam22 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("정수 입력: ");
            num[i] = sc.nextInt();
        }

        for(int i:num){
            sum += i;
        }

        System.out.println("============");
        System.out.println("합계 : " + sum);

    }
}
