package example01.i220401.Exam05;


public class Member {
    private int id; // ID
    private String name; // �̸�

    // ������
    public Member(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID:" + id + " NAME:" + name;
    }






}