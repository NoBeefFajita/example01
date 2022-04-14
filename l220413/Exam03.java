package example01.l220413;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수: ");
        double[] a = new double[sc.nextInt()];
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextDouble();
        }

        for(double d : a) {
            sum += d;
        }

        System.out.println("모든 요소의 합: " + sum);
        System.out.printf("모든 요소의 평균: %2f", sum/a.length);
    }
}
