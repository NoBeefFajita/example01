package youngJun.java.day15.exam;

public class Exam05 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        System.out.println("1부터 n번까지의 합을 구합니다. n의 값: " + n);

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("1부터 n까지의 합은 " + sum + "입니다.");
    }
}