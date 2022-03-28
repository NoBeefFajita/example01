package example01.f220328.Exam03;

public class AlarmClock extends Clock {
    private int alarmHour;      // 알람 시각 시
    private int alarmMinute;    // 알람 시각 분

    public AlarmClock(int hour, int minute, int second, int alarmHour, int alarmMinute) {
        super(hour, minute, second);
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("알람 설정 시간: " + alarmHour + " 시 " + alarmMinute + " 분");
    }
}
