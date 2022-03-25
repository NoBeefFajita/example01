package example01.e220325;

public class Practice7 {
    public static void main(String[] args) {
        // 총 로봇 생산수 표시
        System.out.println("로봇 총 생산수：" + Robot.getTotal());
        // 5가지 로봇 객체 작성
        // （6번째는 보류）
        Robot[] robots = {
                new Robot("RX"),
                new Robot("PZ"),
                new Robot("SS"),
                new Robot("FG"),
                new Robot("VC"),
                null
        };
        // 총 로봇 생산수 표시
        System.out.println("로봇 총 생산 수：" + Robot.getTotal());
        // 6번째 로봇 객체 만들기
        robots[5] = new Robot("SUPER-Z");
        // 총 로봇 생산수 얻기
        System.out.println("로봇 총 생산수：" + Robot.getTotal());
        System.out.println();
        // 6번째 로복 정보 표시
        for (int i = 0; i < robots.length; i++) {
            robots[i].introduce();
        }
    }
}

class Robot {
    private int id;
    private String name;
    private static int total;

    public Robot(String name) {
        this.name = name;
        this.total++;
        this.id = this.total;
    }

    public static int getTotal() {
        return total;
    }

    public void introduce() {
        System.out.println("ID: " + this.id + " ,NAME: " + this.name);
    }
}

