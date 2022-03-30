package example01.h220330;

public class Exam03 {

    public static int med (int a, int b, int c) {       // 중간값 구하기 메소드
        if(a <= b){
            if(a <= c){
                if(b <= c){
                    return b;
                } else {
                    return c;
                }
            } else {
                return a;
            }
        } else {
            if(b <= c) {
                if(a <= c) {
                    return a;
                } else {
                    return c;
                }
            } else {
                return b;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(med(1,3,2));
    }
}
