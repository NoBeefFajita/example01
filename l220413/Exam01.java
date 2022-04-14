package example01.l220413;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        int[] a = new int[5];

        for(int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %d\n", i, 5-i);
            a[i] = 5 - i;
        }
    }
}
