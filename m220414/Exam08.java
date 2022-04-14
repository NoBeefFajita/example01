package example01.m220414;

import java.util.Scanner;

public class Exam08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열s: ");
        String[] s = sc.next().split("");

        for (int i = 0; i < s.length; i++) {
            System.out.printf("s[%d] = %s %X\n", i, s[i], (int)s[i].charAt(0));
        }
    }
}
