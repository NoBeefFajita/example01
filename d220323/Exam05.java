package example01.d220323;

public class Exam05 {
    public static void primeFactorization(int num) {
        int que = num;
        for(int i = 2; i < que/2; i++) {
            if(num % i == 0) {
                num = num/i;
                System.out.println(i + "\t");
                i--;
            }
        }
    }

    public static void main(String[] args) {
        primeFactorization(20);
    }
}
