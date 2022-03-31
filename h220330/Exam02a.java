package example01.h220330;

import java.util.Scanner;

public class Exam02a {

    public static void averageSubjectStudent() {

        Scanner sc = new Scanner(System.in);

        int[][] student = new int[6][2];
        int[] sumSubject = new int[6];

        System.out.println("6명의 국어, 수학점수를 입력하세요.");

        for(int i = 0; i < student.length; i++) {
            System.out.print((i+1) + "번 국어: "); student[i][0] = sc.nextInt();
            System.out.print("\t수학: "); student[i][1] = sc.nextInt();

            sumSubject[0] += student[i][0];
            sumSubject[1] += student[i][1];
        }

        System.out.println("No.  국어   수학   평균");
        for(int i = 0; i < student.length; i++) {
            System.out.printf("%2d  %d   %d   %.1f\n", i+1, student[i][0], student[i][1], (double)(student[i][0] + student[i][1])/2);
        }
        System.out.printf("평균  %.1f   %.1f",(double)sumSubject[0]/student.length, (double)sumSubject[1]/ student.length );
    }

    public static void main(String[] args) {
        averageSubjectStudent();
    }
}
