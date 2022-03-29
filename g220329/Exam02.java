package example01.g220329;

public class Exam02 {
    public static void main(String[] args) {
        int a = 53;
        int b = 35;
        int c = 42;

        intList(a,b,c);

        if(a > b) {
            int t = a;
            a = b;
            b = t;
        }
        if(a > c) {
            int t = a;
            a = c;
            c = t;
        }
        if(b > c) {
            int t = b;
            b = c;
            c = t;
        }

        System.out.println("a < b < c 가 되도록 정렬 했습니다.");
        intList(a,b,c);

    }
    
    public static void intList(int a, int b, int c) {
        System.out.println("정수 a : " + a);
        System.out.println("정수 b : " + b);
        System.out.println("정수 c : " + c);
    }
}
