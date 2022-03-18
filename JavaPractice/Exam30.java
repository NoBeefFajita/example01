package example01.JavaPractice;

public class Exam30 {

    public static void main(String... args) {

        int[] Arr = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
        int nextIdx = 0;

        for(int i = 0; i < 10; i++) {

            System.out.print(Arr[nextIdx] + " ");

            nextIdx = Arr[nextIdx];
        }
    }
}
