package example01.j220404.Exam03;

public class Swimmer extends Athlete {
    public static final String TYPE = "수영";

    public Swimmer(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    public void swim() {
        System.out.println(name + "은 수영을 했습니다.");
    }
}
