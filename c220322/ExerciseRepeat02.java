package example01.example20220322;

public class ExerciseRepeat02 {
    public static void main(String[] args) {
        int[] num = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("평균은 " + tenNumAvg(num) + "입니다.");
    }

    public static int tenNumAvg(int[] num) {
        int sum = 0;
        int avg;

        for(int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        avg = sum / num.length;
        return avg;
    }
}
