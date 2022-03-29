package youngJun.java.day15.exam;

import java.util.Scanner;

public class Exam08 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        for(;;) {

            int x = (int)(Math.random()*900+100);          // 3자리 정수형 난수 3개
            int y = (int)(Math.random()*900+100);
            int z = (int)(Math.random()*900+100);

            int randomCal = (int)(Math.random() * 4);     // 계산 방법 4가지 중 하나 뽑기

            if (randomCal == 0)
                cal1(x, y, z);
            else if (randomCal == 1)
                cal2(x, y, z);
            else if (randomCal == 2)
                cal3(x, y, z);
            else
                cal4(x, y, z);

            System.out.print("다시한번? ");      // 1 no
            boolean again = sc.nextInt() == 1;
            if(again)
                break;
        }
    }

    public static void cal1(int x, int y, int z) {          // x+y+z 메소드
        for(;;) {
            System.out.print(x + " + " + y + " + " + z + " = ");
            int answer = sc.nextInt();
            if(answer == x+y+z) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }

    public static void cal2(int x, int y, int z) {           // x+y-z 메소드
        for(;;) {
            System.out.print(x + " + " + y + " - " + z + " = ");
            int answer = sc.nextInt();
            if (answer == x+y-z) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }

    public static void cal3(int x, int y, int z) {           // x-y+z 메소드
        for(;;) {
            System.out.print(x + " - " + y + " + " + z + " = ");
            int answer = sc.nextInt();
            if (answer == x-y+z) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }

    public static void cal4(int x, int y, int z) {           // x-y-z 메소드
        for(;;) {
            System.out.print(x + " - " + y + " - " + z + " = ");
            int answer = sc.nextInt();
            if (answer == x-y-z) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }
}
