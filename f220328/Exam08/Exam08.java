package example01.f220328.Exam08;

public class Exam08 {
    public static void main(String[] args) {
        int a = 18;
        int b = 6;
        // calc 메서드 호출
        System.out.println("덧셈:" + calc(a, b, 0));
        System.out.println("뺄셈:" + calc(a, b, 1));
        System.out.println("곱셈:" + calc(a, b, 2));
        System.out.println("나눗셈:" + calc(a, b, 3));
    }

    public static int calc(int a, int b, int c) {
        switch (c) {
            case 0:
                return a + b;
            case 1:
                return a - b;
            case 2:
                return a * b;
            case 3:
                return a / b;
        }
        return 0;
    }
}