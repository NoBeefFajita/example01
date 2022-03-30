package example01.example20220322;

public class ExerciseArray02{
    public static void main(String[] args) {
        int[] num = {3, 4, 5, 6, 11, 35, 36, 7, 14, 26};
        int count = inputArray(num);
        printArray(num, count);
    }

    static int inputArray(int[] num) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            count = i;
            if (sum > 100)
                return count;
        }
        return count;
    }

    static void printArray(int[] num, int count) {
        for (int i = 0; i < count + 1; i++) {
            System.out.print(num[i] + "\t");
        }
    }
}