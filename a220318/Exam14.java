package example01.a220318;

import java.util.Scanner;

public class Exam14 {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        int cal1;
        int cal2;

        System.out.print("첫번째 정수 입력: ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        int num2 = sc.nextInt();

        cal1 = num1/num2;
        cal2 = cal1*num2;

        System.out.println(num1 + " / " + num2 + " = " + cal1);
        System.out.println(cal1 + " * " + num2 + " = " + cal2);
    }

}
