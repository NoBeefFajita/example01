package example01.f220328.Exam05;

public class Exam05 {
    public static void main(String[] args) {
        int value = 35;

        System.out.println("value: " + value);
        System.out.println(value % 2 == 0 ? "「짝수입니다」" : "「홀수입니다」");

        if(value % 3 == 0) {
            System.out.println("「3의 배수입니다」");
        }
        if(value % 4 == 0) {
            System.out.println("「4의 배수입니다」");
        }
        if(value % 5 == 0) {
            System.out.println("「5의 배수입니다」");
        }
    }
}
