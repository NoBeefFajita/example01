package example01.h220330;

import java.util.Random;

public class Exam04 {

    public static int random(int a, int b) {
        Random rd = new Random();

        if(b <= a)
            return a;

        System.out.println("난수를 생성합니다.");
        System.out.println("하한값: " + a);
        System.out.println("상한값: " + b);

        return rd.nextInt(a,b + 1);
    }

    public static void main(String[] args) {
        System.out.println(random(10,99));
    }
}
