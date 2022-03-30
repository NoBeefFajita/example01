package example01.a220318;

public class Exam31 {

    public static void main(String... args) {

        int[] Arr = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};

        for (int i = 0; i < 9; i++) {

            int result = Arr[i] - Arr[Arr[i]];

            System.out.print(result + " ");
        }
    }
}
