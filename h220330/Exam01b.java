package example01.h220330;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01b {
    public static void schoolScoreAverage() {

        Scanner sc = new Scanner(System.in);

        System.out.print("학급수: ");
        int[][] student = new int[sc.nextInt()][];
        int[] sum = new int[student.length];
        int totalStudent = 0;
        int totalSum = 0;

        for(int i = 0; i < student.length; i++) {
            System.out.printf("\n%d반의 학생수: ",i+1);
            student[i] = new int[sc.nextInt()];
            totalStudent += student[i].length;

            for(int j = 0; j < student[i].length; j++) {
                System.out.printf("%d반 %d번의 점수: ",i+1,j+1);
                sum[i] += sc.nextInt();
            }
        }

        System.out.println("\n반|     합계     평균\n"
                         + "--------------------");

        for(int i = 0; i < student.length; i++) {
            System.out.printf("%d반|   %d    %.1f\n",i+1, sum[i], (double)sum[i]/student[i].length);
            totalSum += sum[i];
            if(i == student.length-1) {
                System.out.println("--------------------");
                System.out.printf("합계|   %d   %.1f\n", totalSum, (double)totalSum/totalStudent);
            }
        }

        System.out.println(Arrays.toString(student[0]));
        System.out.println(Arrays.toString(student[1]));

    }
    public static void main(String[] args) {
        schoolScoreAverage();
    }
}