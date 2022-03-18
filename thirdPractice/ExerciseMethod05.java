package example01.thirdPractice;

import java.util.Scanner;

public class ExerciseMethod05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int input = sc.nextInt();

        System.out.println(input + "의 제곱 : " + squ(input));
    }

    static int squ(int num) {
        return num * num;
    }
}
