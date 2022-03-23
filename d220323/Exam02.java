package example01.d220323;

public class Exam02 {
    public static String discriminant (int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            return "실근";
        } else if (discriminant == 0) {
            return "중근";
        } else {
            return "허근";
        }
    }

    public static void main(String[] args) {
        System.out.println(discriminant(4,4,1));
    }
}
