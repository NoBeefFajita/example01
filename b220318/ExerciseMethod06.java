package example01.b220318;

import java.util.Scanner;

public class ExerciseMethod06 {

    public static void main(String...args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력: ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + "과(와) " + num2 + "중 보다 큰 값은 "
                         + greater(num1,num2) + "입니다.");
    }

    static int greater(int x, int y) {
        if(x < y)
            return y;
        else
            return x;
    }
}
