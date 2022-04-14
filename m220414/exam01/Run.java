package example01.m220414.exam01;

import static java.time.LocalDate.of;

public class Run {
    public static void main(String[] args) {
        Human hm1 = new Human("홍길동", 170, 60, of(1975,3,12));
        System.out.println(hm1);

        Human2 hm2 = new Human2("이순신", 169, 72, of(1987,10,7));
        System.out.println(hm2);
    }
}
