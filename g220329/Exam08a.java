package example01.g220329;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exam08 {
    static Scanner sc = new Scanner(System.in);

    public static boolean retry() {
        String retry;
        do{
            System.out.println("다시한번: y/n"); retry = sc.next().toLowerCase();
        } while (!retry.equals("y") && !retry.equals("n"));
        return retry.equals("y");
    }

    public static void mentalMeth() {

        Random random = new Random();

        do {
            int k = random.nextInt(4);
            int x = random.nextInt(100,1000);
            int y = random.nextInt(100,1000);
            int z = random.nextInt(100,1000);

            System.out.println("암산하기");

            int answer;

            do {
                switch (k) {
                    case 1 -> {
                        System.out.printf("%d + %d + %d = ", x, y, z);
                        answer = x + y + z;
                    }
                    case 2 -> {
                        System.out.printf("%d - %d + %d = ", x, y, z);
                        answer = x - y + z;
                    }
                    case 3 -> {
                        System.out.printf("%d + %d - %d = ", x, y, z);
                        answer = x + y - z;
                    }
                    default -> {
                        System.out.printf("%d - %d - %d = ", x, y, z);
                        answer = x - y - z;
                    }
                }
                if(sc.nextInt() == answer)
                    break;
                else
                    System.out.println("틀렸습니다.");
            } while (true);
        } while (retry());
    }

    public static void main(String[] args) {
        mentalMeth();
    }
}
