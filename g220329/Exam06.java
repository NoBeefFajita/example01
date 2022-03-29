package youngJun.java.day15.exam;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 더합니다");
        System.out.print("몇 개를 더할까요: ");

        int sumNumUnit = sc.nextInt();          // 더하는 정수 수
        int[] num = new int[sumNumUnit];        // 더할 정수 배열 선언
        int sum = 0;                            // 합계 초기화
        double avg = 0;                         // 평균 초기화

        for(int i = 0; i < num.length; i++) {
            System.out.print("정수: ");
            num[i] = sc.nextInt();
            sum += num[i];

            if(sum > 1000) {
                System.out.println("합계가 1000을 넘었습니다.");
                System.out.println("마지막 값은 무시합니다.");
                sum -= num[i];
                break;
            }
            avg = (double)sum / (i+1);
        }

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
