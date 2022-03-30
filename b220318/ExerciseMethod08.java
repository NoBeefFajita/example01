package example01.b220318;

import java.util.Scanner;

public class ExerciseMethod08 {

    public static void main(String...args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int dan = sc.nextInt();

        gugudan(dan);
    }

    // 단 출력 method
    static void gugudan(int dan) {
        System.out.println("==== " + dan + "단 ====");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
