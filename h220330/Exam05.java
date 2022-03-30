package example01.h220330;

public class Exam05 {

    public static int[] arrayIntOf(int[] a, int idx, int x) {   // 배열 a의 인덱스 idx에 값 x를 추가하는 메소드

        System.out.println("삽입할 인덱스: " + idx);
        System.out.println("삽입할 값: " + x);
        
        int[] b = new int[a.length+1];          // 배열 a 보다 요소수+1 인 배열 b 

        for(int i = 0; i < b.length; i++) {     // 배열 b 초기화

            if (i == idx) {
                b[i] = x;
            } else if(i > idx) {
                b[i] = a[i-1];
            } else {
                b[i] = a[i];
            }
        }

        return b;
    }
    
    public static void arrayElementPrint(int[] a, String x) {       // 배열 요소 출력 메소드
        for(int i = 0; i < a.length; i++) {
            System.out.println(x + "[" + i + "]:" + a[i]);
        }
    }

    public static void main(String[] args) {

        int idx = 2;
        int x = 99;

        System.out.println("요소수: 6");
        int[] a = {1, 3, 4, 7, 9, 11};

        arrayElementPrint(a, "x");          // 배열 a 출력

        int[] b = arrayIntOf(a, idx, x);

        arrayElementPrint(b, "y");           // 배열 b 출력
    }
}
