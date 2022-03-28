package example01.f220328.Exam06;

public class Exam06 {
    public static void main(String[] args) {
        for (int num = 10; num < 100; num++) {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0)
                    continue;
            }
        }
    }
}
