package example01.a220318;

public class Exam13 {
    public static void main(String... args) {
        double height, weight, bmi;             // double
        height = 1.75;
        weight = 65.0;
        bmi = weight/(height*height);           // BMI = 체중/신장^2

        System.out.println("BMI = " + bmi);
    }
}
