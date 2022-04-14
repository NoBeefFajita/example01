package example01.m220414.exam04;

import java.time.LocalDate;

public class Coordination {
    private int x;
    private int y;
    private static int count = 0;
    public Coordination() {
        this(0,0);
    }

    public Coordination(int x) {
        this(x,0);
    }

    public Coordination(int x, int y) {
        this.x = x;
        this.y = y;

        if(count + 1 == LocalDate.now().getDayOfMonth()) {
            System.out.println("당첨! 오늘 " + (count + 1) + "개의 좌표가 생성되었습니다");
        }
        System.out.printf("%d (%d,%d)\n", count++, this.x, this.y);
    }
}
