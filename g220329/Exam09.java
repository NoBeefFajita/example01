package youngJun.java.day15.exam;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Exam09 {
    public static void main(String[] args) {

        GregorianCalendar day = new GregorianCalendar();
        Random random = new Random();

        String[] fortuneList = {"대길", "길", "중길", "소길", "흉"};
        int todayFortune = random.nextInt(5);

        System.out.println("오늘은 " +
                           day.get(Calendar.YEAR) + "년 " +
                          (day.get(Calendar.MONTH) + 1) + "월 " +
                           day.get(Calendar.DAY_OF_MONTH) + "일입니다.");


        System.out.println("오늘의 운세는 " +  fortuneList[todayFortune] + "입니다.");
    }
}
