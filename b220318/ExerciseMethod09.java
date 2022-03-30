package example01.b220318;

public class ExerciseMethod09 {

    public static void main(String... arg) {
        for (int i = 10000; i < 10100; i++) {
            if(primeNum(i) == 1) {
                System.out.println(i + "는 소수입니다.");
            }
        }
    }


    static int primeNum(int num) {          // 인수 num이 소수일시 1 소수가 아닐시 0 반환
        if (num < 2)
            return 0;

        for (int i = 2; i <= num; i++) {
            if (num != i && num % i == 0)
                return 0;
            else if (num == i)
                return 1;
        }
        return 3;                           // return 3; 설정하지 않을시 뜨는 return 문 누락 오류 회피용;
    }
}
