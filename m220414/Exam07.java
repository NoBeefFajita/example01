package example01.m220414;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Exam07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열: ");
        String[] str = sc.next().split("");

        System.out.print("역순: ");
        ArrayList<String> list = new ArrayList<>(List.of(str));
        Collections.reverse(list);
        list.forEach(System.out::print);
    }
}
