package example01.i220401.Exam03;

public class Picture {

    private String target;  // 피사체
    // 생성자
    public Picture(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return target + "의 화상";
    }
}
