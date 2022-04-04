package example01.j220404.Exam04;

abstract class Musician {
    // 이름 필드
    private String name;
    // 생성자
    public Musician(String name) {
        this.name = name;
    }
    // 이름 취득 방법
    public String getName() {
        return name;
    }
}