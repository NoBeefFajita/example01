package example01.c220322;

import java.util.Scanner;

public class ExerciseArray02Scanner {
    public static void main(String[] args) {
        int[] num = new int[10];
        inputArray(num);
    }

    static void inputArray(int[] num) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("숫자 입력: ");
            num[i] = sc.nextInt();

            sum += num[i];
            count = i;
            if (sum > 100)
                break;
        }

        for (int i = 0; i < count + 1; i++) {
            System.out.print(num[i] + "\t");
        }
    }
}
