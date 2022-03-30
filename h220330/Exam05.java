package example01.h220330;

public class Exam05 {

    public static int[] arrayIntOf(int[] a, int idx, int x) {

        int[] b = new int[a.length+1];

        for(int i = 0; i < b.length; i++) {

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

    public static void main(String[] args) {

        int index = 2;
        int element = 99;

        System.out.println("요소수: 6");
        int[] a = {1, 3, 4, 7, 9, 11};

        for(int i = 0; i < a.length; i++) {
            System.out.println("x[" + i + "]:" + a[i]);
        }

        System.out.println("삽입할 인덱스: " + index);
        System.out.println("삽입할 값: " + element);

        int[] b = arrayIntOf(a, index, element);

        for(int i = 0; i < b.length; i++) {
            System.out.println("y[" + i + "]:" + b[i]);
        }
    }
}
