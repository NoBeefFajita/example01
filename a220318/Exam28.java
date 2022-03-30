package example01.JavaPractice;

import java.util.Scanner;

public class Exam28 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        int[] Arr = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};

        System.out.print("첫번째 정수: ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수: ");
        int num2 = sc.nextInt();

        int cal = Arr[num1] * Arr[num2];

        System.out.print("Arr[" + num1 + "]*Arr[" + num2 + "] = " + cal);
    }
}
