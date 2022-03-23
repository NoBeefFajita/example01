package example01.d220323;

public class Exam04 {
    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            System.out.println(year + "년은 윤년입니다.");
        else if (year % 4 == 0 && year % 100 == 0)
            System.out.println("윤년이 아닙니다.");
        else if (year % 4 == 0)
            System.out.println(year + "년은 윤년입니다.");
        else
            System.out.println("윤년이 아닙니다.");
    }

    public static void main(String[] args) {
        leapYear(2022);
    }
}
