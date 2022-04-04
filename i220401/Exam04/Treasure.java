package example01.i220401.Exam04;

public class Treasure {
    private String type;    // 보물의 유형

    public Treasure(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
