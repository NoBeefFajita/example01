package example01.example20220322;

import java.util.Arrays;

public class ExerciseArray01 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        doubleNum(num);
    }

    static void doubleNum(int[] num) {
        for(int i = 0; i < num.length; i++) {
            num[i] *= 2;
        }
        System.out.println(Arrays.toString(num));
    }
}
