package example01.d220323;

public class Exam01 {

    public static String evenOrOdd(int num) {
        if (num % 2 == 0)
            return "even";
        else
            return "odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(12));
    }
}
