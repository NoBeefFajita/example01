package example01.j220404.Exam03;

public class MarathonRunner extends Athlete{
    public static final String TYPE = "마라톤";

    public MarathonRunner(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    public void run() {
        System.out.println(name + "가 달렸습니다.");
    }
}
