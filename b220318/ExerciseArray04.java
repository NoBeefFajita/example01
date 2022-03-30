package example01.b220318;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseArray04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];                // 배열 선언

        for(int i = 0; i < 10; i++) {           // 배열 초기화
            System.out.print("숫자 입력: ");
            num[i] = sc.nextInt();
        }

        // 1번
        int temp;
        for(int i = 0; i < num.length-1; i++) {
            for(int j = 0; j < num.length-1; j++){
                if(num[j] > num[j+1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));

        // 2번
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
