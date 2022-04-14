package example01.l220413;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        ArrayList<Integer> intArr = new ArrayList<>();
        System.out.print("요소수: ");
        int ele = sc.nextInt();

        while (ele-- != 0){
            intArr.add(rd.nextInt(1,11));
        }

        for (int i = 10; i > 0; i--) {
            for(int a: intArr) {
                if (a >= i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("--".repeat(intArr.size()));

        for(int i = 0 ; i< intArr.size(); i++) {
            System.out.print(i%10 + " ");
        }
    }
}
