package example01.h220330;

import java.util.Scanner;

public class Exam01a {

    public static void schoolScoreAverage() {

        Scanner sc = new Scanner(System.in);

        System.out.print("학급수: ");
        int classNum = sc.nextInt();
        int[] sum = new int[classNum];
        double[] avg = new double[classNum];
        int totalSum = 0;
        double totalAvg = 0;

        for(int i = 0; i < classNum; i++) {
            System.out.printf("%d반의 학생수: ",i+1);
            int classStudent = sc.nextInt();

            for(int j = 0; j < classStudent; j++) {
                System.out.printf("%d반 %d번의 점수: ",i+1,j+1);
                sum[i] += sc.nextInt();
            }
            System.out.println();
            avg[i] = (double)sum[i]/classStudent;
        }

        System.out.println();
        System.out.println("반|     합계     평균\n"
                         + "--------------------");

        for(int i = 0; i < classNum; i++) {
            System.out.printf("%d반|   %d    %.1f\n",i+1,sum[i],avg[i]);
            totalSum += sum[i];
            totalAvg += avg[i];
            if(i == classNum-1) {
                System.out.println("--------------------");
                System.out.printf("합계|   %d   %.1f",totalSum,totalAvg/2);
            }
        }
    }

    public static void main(String[] args) {
        schoolScoreAverage();
    }
}
