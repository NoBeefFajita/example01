package example01.m220414;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열: ");
        String s = sc.next();

        System.out.println("s1 = " + s1(s));
        System.out.println("s2 = " + s2(s));
        System.out.println("s3 = " + s3(s));
        System.out.println("s4 = " + s4(s));
        System.out.println("s5 = " + s5(s));
        System.out.println("s6 = " + s6(s));
    }

    static String s1(String s) {
        char a = s.charAt(1);
        return a++ + String.valueOf(a++) + a;
    }

    static String s2(String s) {
        return "" + (char)Math.abs(s.charAt(0) - s.charAt(1) + 1);
    }

    static String s3(String s) {
        char a = s.charAt(1);
        String s3 = "";
        while(a < s.charAt(2) - 1) {
            s3 += String.valueOf(a++);
        }
        return s3;
    }

    static String s4(String s) {
        char a = (char)(s.charAt(0) - 2);
        return a++ + String.valueOf(a++) + a;
    }

    static String s5(String s) {
        char a = (char)(s.charAt(2) * 2 - s.charAt(1) + 1);
        return a++ + String.valueOf(a++) + a;
    }

    static String s6(String s) {
        return s;
    }
}
