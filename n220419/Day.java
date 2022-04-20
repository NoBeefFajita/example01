package example01.n220419;

import java.time.LocalDate;
import java.util.List;

public class Day {
    private int year,
                month,
                day;
    private final List<Integer> MONTHDAY = List.of(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

    /**
     * 생성자
     */
    public Day() {
        year = LocalDate.now().getYear();
        month = LocalDate.now().getMonthValue();
        day = LocalDate.now().getDayOfMonth();
    }

    public Day(int year) {
        this();
        this.year = year;
        invalidArgument(year);
    }

    public Day(int year, int month) {
        this(year);
        this.month = month;
        invalidArgument(year, month);
    }

    public Day(int year, int month, int day) {
        this(year,month);
        this.day = day;
        invalidArgument(year, month, day);
    }
    
    public Day(Day d) {
        this(d.year, d.month, d.day);
    }

    /**
     * getter
     */
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    /**
     * setter
     */
    public void setYear(int year) { this.year = year; invalidArgument(year); }
    public void setMonth(int month) { this.month = month; invalidArgument(year, month); }
    public void setDay(int day) { this.day = day; invalidArgument(year, month, day); }
    public void set(int year, int month, int day) { setYear(year); setMonth(month); setDay(day); }

    /**
     * 부적격한 인수 처리 메소드
     * year: 음수 불가능
     * month: 음수 입력시 1
     *        12 초과 입력시 12
     * day: 0 or 음수 입력시 1
     *      월의 마지막 일 초과 입력시 마지막 일로 수정
     */
    private void invalidArgument(int year) {
        if(year <= 0) throw new IllegalArgumentException("Year cannot be negative");
    }

    private void invalidArgument(int year, int month) {
        invalidArgument(year);
        if(month > 12) this.month = 12;
        if(month < 1) this.month = 1;
    }

   private void invalidArgument(int year, int month, int day) {
        invalidArgument(year);
        invalidArgument(year, month);
        if(day < 1) this.day = 1;
        switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> { if(day > 31) this.day = 31; }
            case 4,6,9,11 -> { if(day > 30) this.day = 30; }
            case 2 -> {
                if(leapYear(year)) {
                    if(day > 29) this.day = 29;
                } else if(day > 28) this.day = 28;
            }
        }
    }

    /**
     * 요일 찾기 메소드 (제라의 공식)
     * @return  0 = 일 ~ 6 = 토
     */
    public int dayOfWeek() {
        int y = year,
            m = month;
        if(m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + day) % 7;
    }
    public static int dayOfWeek(int year, int month, int day) {return new Day(year, month, day).dayOfWeek(); }

    /**
     * toString Override
     */
    @Override
    public String toString() {
        String[] wd = { "일", "월", "화", "수", "목", "금", "토" };
        return String.format("%04d년 %02d월 %02d일(%s)", year, month, day, wd[dayOfWeek()]);
    }

    /**
     * 윤년 판단 method
     * @return 윤년이면 true
     */
    public boolean leapYear() {
        return (year % 4 == 0 && !(year % 100 == 0)) ||
               (year % 4 == 0 && year % 400 == 0);
    }
    public static boolean leapYear(int year) { return new Day(year).leapYear(); }

    /**
     * 연내의 경과 일수 메소드
     */
    public int dayOfYear() {
        int days = MONTHDAY.stream()
                .limit(month - 1)
                .mapToInt(Integer::intValue)
                .sum()
                + day;
        return  leapYear()? days + 1 : days;
    }
    public static int dayOfYear(int year, int month, int day) { return new Day(year, month, day).dayOfYear(); }

    /**
     * 연내의 남은 일수 메소드
     */
    public int remainingDayOfYear() {
        return leapYear()? 366 - dayOfYear() : 365 - dayOfYear();
    }
    public static int remainingDayOfYear(int year, int month, int day) { return new Day(year, month, day).remainingDayOfYear(); }

    /**
     * 다른 날짜와의 전후 관계 판정 메소드
     * 인스턴스 메소드:
     * @param year,month,day 입력한 날과 비교하여
     * @return -1 : 이전날
     *          0 : 동일한 날
     *          1 : 다음날
     */
    public int compareDate(int year, int month, int day) {
        if(this.year < year) return 1;
        else if(this.year > year) return -1;
        else {
            if(this.month < month) return 1;
            else if(this.month > month) return -1;
            else return Integer.compare(day, this.day);

        }
    }
    
    public int compareDate(Day targetDate) {
        int y = targetDate.getYear(),
            m = targetDate.getMonth(),
            d = targetDate.getDay();
        return compareDate(y, m, d);
    }

    /**
     * 클래스 메소드:
     * @param referenceDate 기준일
     * @param targetDate 비교일
     */
    public static int compareDate(Day referenceDate, Day targetDate) {
        return referenceDate.compareDate(targetDate);
    }

    /**
     * 날짜를 하루 뒤로 변경하는 메소드
     */
    public void nextDays() {
        if(MONTHDAY.get(month - 1) == day) {
            if(month == 12) {
                setYear(year + 1);
                setMonth(1);
            } else {
                setMonth(month + 1);
            }
            setDay(1);
        } else setDay(day + 1);
    }

    /**
     * 다음 날의 날짜를 반환하는 메소드
     * @return Day 클래스 형태로 반환
     */
    public static Day nextDays(int year, int month, int day) {
        Day d = new Day(year, month, day);
        d.nextDays();
        return d;
    }

    /**
     * 날짜를 하루 앞으로 변경하는 메소드
     */
    public void previousDay() {
        if(day == 1) {
            if(month == 1) {
                setYear(year - 1);
                setMonth(12);
            } else {
                setMonth(month - 1);
            }
            setDay(MONTHDAY.get(month - 1));
        } else setDay(day - 1);
    }

    /**
     * 하루 전의 날짜를 반환하는 메소드
     * @return Day 클래스 형태로 반환
     */
    public static Day previousDay(int year, int month, int day) {
        Day d = new Day(year, month, day);
        d.previousDay();
        return d;
    }

    /**
     * 날짜를 n일 뒤로 변경하는 메소드
     */
    public void plusDays(int n) {
        if(n <= 0) return;
        nextDays();
        n--;
        if(n > 0) plusDays(n);
    }

    /**
     * n일 뒤의 날짜를 리턴하는 메소드
     */
    public static Day plusDays(int year, int month, int day, int n) {
        Day d = new Day(year, month, day);
        d.plusDays(n);
        return d;
    }

    /**
     * 날짜를 n일 앞으로 변경하는 메소드
     */
    public void minusDays(int n) {
        if(n <= 0) return;
        previousDay();
        n--;
        if(n > 0) minusDays(n);
    }

    /**
     * n일 앞의 날짜를 리턴하는 메소드
     */
    public static Day minusDays(int year, int month, int day, int n) {
        Day d = new Day(year, month, day);
        d.minusDays(n);
        return d;
    }
}
