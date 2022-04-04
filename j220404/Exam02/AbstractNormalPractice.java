package example01.j220404.Exam02;

public class AbstractNormalPractice {
    public static void main(String[] args) {
        // 센터 포워드 객체 생성
        SoccerPlayer fwd = new CenterForward( "홍길동" , 11 );
        // 자기 소개
        System.out.println(fwd);
        // 공을 처리
        fwd.kickBall();
        fwd.catchBall();
        System.out.println();
        // 골키퍼 객체 생성
        SoccerPlayer keeper = new GoalKeeper( "이순신" , 12 );
        // 자기 소개
        System.out.println(keeper);
        // 공을 처리
        keeper.kickBall();
        keeper.catchBall();
    }
}