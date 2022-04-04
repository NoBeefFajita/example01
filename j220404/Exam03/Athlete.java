package example01.j220404.Exam03;

abstract class Athlete {
    // 선수명
    protected String name;
    // 종목명 취득 메소드(추상 메소드)
    public abstract String getType();
    @Override
    public String toString() {
        return "내 이름은 " + name + ", " + getType() + " 선수입니다." ;
    }
}
