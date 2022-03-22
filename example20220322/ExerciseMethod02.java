package example01.example20220322;

public class ExerciseMethod02 {
    public static void main(String[] args) {
        fibonacci(11, 20);
    }

    static void fibonacci(int from, int to) {
        int[] fibo = new int[to];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }

        for (int i = from; i <= to - 1; i++) {
            System.out.print(fibo[i] + "\t");
        }
    }
}
