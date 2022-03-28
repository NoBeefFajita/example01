package example01.f220328.Exam02;

public class InheritanceConstructorPractice {
    public static void main(String[] args) {
        // Magazine클래스 객체 생성
        Magazine magazine = new Magazine("GQ", 10000, "정우성");
        // 잡지내용 소개 메소드 호출
        magazine.show();
    }
}
