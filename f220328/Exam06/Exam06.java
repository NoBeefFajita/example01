package example01.f220328.Exam06;

public class Exam06 {
    public static void main(String[] args) {
        boolean primeNumber;

        for (int num = 10; num < 100; num++) {
            primeNumber = true;
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0)
                    primeNumber = false;
            }
            if (primeNumber)
                System.out.println(num);
        }
    }
}
