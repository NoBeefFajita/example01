package example01.JavaPractice;

import java.util.Scanner;

public class Exam29 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        int[] Arr = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};

        System.out.print("정수 값 입력: ");
        int num = sc.nextInt();

        int result = Arr[Arr[num]];

        System.out.println(result);
    }
}
