package example01.n220419;

import java.util.Scanner;

public class DayTester {
    static Scanner sc = new Scanner(System.in);

    /**
     * 메인 메소드
     */
    public static void main(String[] args) {
        Day day1 = newDay();
        aboutDates(day1);
    }

    /**
     * 날짜 프로그램 루프
     */
    private static void aboutDates(Day day1) {
        for(int choose = 1; choose < 5 && choose > 0;) {
            System.out.print("""
                
                [1]날짜관련정보 표시 [2]날짜변경 [3]다른 날짜와의 비교 [4]전후 날짜 [5]종료
                입력:\s""");
            choose = sc.nextInt();

            switch (choose) {
                case 1 -> ch1(day1);
                case 2 -> day1 = ch2();
                case 3 -> ch3(day1);
                case 4 -> ch4(day1);
                default -> System.out.println("프로그램을 종료합니다.");
            }
        }
    }

    /**
     * Day 클래스 인스턴스화 메소드
     * 년, 월, 일 입력받아 Day 인스턴스화
     */
    private static Day newDay() {
        System.out.print("""
                          날짜를 입력하세요
                          년도:\s""");
        int year = sc.nextInt();
        System.out.print("월: ");
        int month = sc.nextInt();
        System.out.print("일: ");
        int day = sc.nextInt();

        return new Day(year, month, day);
    }

    /**
     * 날짜관련정보 표시
     */
    public static void ch1(Day d) {
        System.out.printf("""
                %s에 관한 정보
                %s
                년도 내 경과일수: %d
                """
                ,d
                ,d.leapYear()? "윤년입니다." : "윤년이 아닙니다."
                ,d.dayOfYear());
    }

    /**
     * 날짜변경
     */
    public static Day ch2() {
        Day d = newDay();
        System.out.println(d + "로 변경되었습니다.");
        return d;
    }

    /**
     * 다른 날짜와의 비교
     */
    public static void ch3(Day d) {
        Day day2 = newDay();
        int c = Day.compareDay(d,day2);
        if(c == 1) System.out.printf("%s는 %s보다 이후의 날입니다.\n", day2, d);
        else if(c == -1) System.out.printf("%s는 %s보다 이전의 날입니다.\n", day2, d);
        else System.out.printf("%s는 %s과 동일한 날입니다.\n", day2, d);
    }

    /**
     * 전 후 날짜
     */
    public static void ch4(Day d) {
        System.out.print("""
                [1]전 날짜 [2]후 날짜
                입력:\s"""); int pom = sc.nextInt();
        if(pom == 1) {
            System.out.print("며칠 전? ");
            d.minusDays(sc.nextInt());
            System.out.println(d + "입니다.");
        } else if(pom == 2) {
            System.out.print("며칠 후? ");
            d.plusDays(sc.nextInt());
            System.out.println(d + "입니다.");
        } else System.out.println("잘못된 입력");
    }
}
