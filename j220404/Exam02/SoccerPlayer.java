package example01.j220404.Exam02;

abstract class SoccerPlayer {
    private String name;
    private int uniformNumber;

    public SoccerPlayer(String name, int uniformNumber) {
        this.name = name;
        this.uniformNumber = uniformNumber;
    }

    public String getName() {
        return name;
    }

    public void kickBall() {
        System.out.println(name + "은 공을 찼습니다.");
    }

    public void catchBall() {
        System.out.println(name + "공을 발로 받았습니다.");
    }

    abstract String getPositionName();

    @Override
    public String toString() {
        return getPositionName() + " " + name + " " + uniformNumber;
    }
}