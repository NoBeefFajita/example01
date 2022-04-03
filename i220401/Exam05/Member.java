package example01.i220401.Exam05;


public class Member {
    private int id; // ID
    private String name; // 이름

    // 생성자
    public Member(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID:" + id + " NAME:" + name;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member tmp = (Member) obj;
            if (this.id == tmp.id) {
                return true;
            }
        }
        return false;
    }
}