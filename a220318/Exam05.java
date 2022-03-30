package example01.a220318;

public class Exam05 {

    public static void main(String... args) {

        // 나뭇잎 그리기
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0)
                continue;


            for (int j = 0; j < (15 + i) / 2; j++) {
                if ((15 - i) / 2 > j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        // 기둥 그리기
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                if (j < 7)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        // 지면 그리기
        for (int i = 0; i < 15; i++) {
            System.out.print("\"");
        }
    }
}
