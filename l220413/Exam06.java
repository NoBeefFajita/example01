package example01.l220413;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("실수값: ");
        double r = sc.nextDouble();
        double abs = Math.abs(r);
        double sqrt =  Math.sqrt(abs);
        BigDecimal br = new BigDecimal(r);
        BigDecimal bpi = new BigDecimal(Math.PI);

        System.out.printf("""
                절대값: %.1f
                제곱근: %.15f
                면적: %.15f""",abs,sqrt, br.multiply(br).multiply(bpi));
    }
}
