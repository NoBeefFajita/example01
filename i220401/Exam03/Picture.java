package example01.i220401.Exam03;

public class Picture {

    private String target;  // �ǻ�ü
    // ������
    public Picture(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return target + "�� ȭ��";
    }
}
