package example01.j220404.Exam03;

public class Practice3 {
    public static void main(String[] args) {
        // 선수 배열 객체 생성
        Athlete[] athlete = {
                new Swimmer( "홍길동" ),
                new MarathonRunner( "이순신" ),
                new Swimmer( "이빛나" ),
                new MarathonRunner( "김선두" )
        };
        // 자기 소개
        for ( int i = 0 ; i < athlete.length; i++) {
            System.out.println(athlete[i]);
        }
        System.out.println();
        for (Athlete type: athlete) {            // 여기에서 일하십시오.

            if(type instanceof Swimmer)          // 운동 선수의 종목에 따라 메소드 실행
                ((Swimmer) type).swim();

            if(type instanceof MarathonRunner)
                ((MarathonRunner) type).run();
        }
    }
}
