package example01.f220328.Exam07;

public class Exam07 {
    public static void main(String[] args) {
        int level = 5;

        for (int i = 0; i < level; i++) {
            for (int j = 0; j < level + i; j++) {
                if (j < level - i-1)
                    System.out.print("□ ");
                else
                    System.out.print("■ ");
            }
            System.out.println();
        }
    }
}
