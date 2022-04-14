package example01.l220413;

public class Exam05 {
    public static void main(String[] args) {
        long max = 0;
        long min = 0;
        byte a = 0;
        short b = 0;
        int c = 0;
        long d = 0;

        while (a >= 0) {
            max = a;
            a += 1;
            min = a;
        }
        System.out.println("byte형: " + min + " ~ " + max);

        while (b >= 0) {
            max = b;
            b += 1;
            min = b;
        }
        System.out.println("short형: " + min + " ~ " + max);

        while (c >= 0) {
            max = c;
            c += 1;
            min = c;
        }
        System.out.println("int형: " + min + " ~ " + max);

//        while (d >= 0) {
//            max = d;
//            d += 1;
//            min = d;
//        }
        System.out.println("long형: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
    }
}
