package example01.j220404.Exam02;

public class CenterForward extends SoccerPlayer{

    public static final String POSITION_NAME = "센터 포워드";

    public CenterForward(String name, int uniformNumber) {
        super(name, uniformNumber);
    }

    @Override
    String getPositionName() {
        return POSITION_NAME;
    }
}