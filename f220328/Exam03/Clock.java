package example01.f220328.Exam03;

class Clock {
    // 시분초
    private int hour;
    private int minute;
    private int second;
    // 생성자
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // 정보 표시 방법
    public void showData() {
        System.out.println("현재 시간：" + hour + "시" + minute + "분" + second + "초");
    }
}