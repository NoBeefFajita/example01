package example01.j220404.Exam02;

public class GoalKeeper extends SoccerPlayer{

    public static final String POSITION_NAME = "골키퍼";

    public GoalKeeper(String name, int uniformNumber) {
        super(name, uniformNumber);
    }

    @Override
    public String getPositionName() {
        return POSITION_NAME;
    }

    @Override
    public void catchBall() {
        System.out.println(super.getName() + "는 공을 손으로 받았습니다.");
    }
}