package example01.h220330;

import java.util.Scanner;

public class Exam01 {

    public static void main(String[] args) {
        schoolScoreAverage();
    }

    public static void schoolScoreAverage() {
        Scanner sc = new Scanner(System.in);

        System.out.print("학급 수: ");

        int numOfClass = sc.nextInt();                       // 학급 수
        int[] classStudent = new int[numOfClass];            // 각 반의 학생 수
        int[] sum = new int[numOfClass];                     // 각 반 총점
        double[] avg = new double[numOfClass];               // 각 반 평균
        int totalSum = 0;                                    // 전체 합계
        double totalAvg = 0;                                 // 합계 평균

        System.out.println();

        for(int i = 0; i < classStudent.length; i++) {

            sum[i] = 0;                                      // 총점 초기화
            avg[i] = 0;                                      // 평균 초기화

            System.out.print((i+1) + "반의 학생수: ");        // 학급별 학생 수 입력
            classStudent[i] = sc.nextInt();

            for(int j = 0; j < classStudent[i]; j++) {      // 학급 학생별 점수 입력 및 총점 합산 & 평균 계산
                System.out.print( (i+1) + "반 " + (j+1) + "번의 점수: ");

                sum[i] += sc.nextInt();
                avg[i] = (double)sum[i] / classStudent[i];
                avg[i] = Math.ceil(avg[i]*10)/10;           // 소수 둘째자리 올림
            }
            System.out.println();
        }

        // totalSum, totalAvg
        for(int i = 0; i < numOfClass; i++) {
            totalSum += sum[i];
            totalAvg += avg[i];
        }
        totalAvg /= numOfClass;
        totalAvg = Math.ceil(totalAvg*10)/10;               // 소수 둘째자리 올림


        // 출력
        System.out.println("반 |" + "\t합계\t" + "\t평균");
        System.out.println("-----------------------");

        for(int i = 0; i < numOfClass; i++) {
            System.out.println((i+1) + "반|\t" + sum[i] + "\t\t" + avg[i]);

        }
        System.out.println("-----------------------");
        System.out.println("합계|\t" +  totalSum + "\t\t" + totalAvg);
    }
}
