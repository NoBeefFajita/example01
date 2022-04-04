package example01.j220404.Exam04;

public class Practice4 {
    public static void main(String[] args) {
        // 뮤지션 배열 만들기
        Musician[] band = {
                new Vocalist( "홍길동" ),
                new Guitarist( "이순신" , "리드 기타" ),
                new Guitarist( "이빛나" , "베이스" ),
                new ChorusDrummer( "이빛나" )
        };
        // 뮤직 스타트!

        for(Musician a : band) {
            if(a instanceof Singable)
                ((Singable) a).sing();

            if(a instanceof Playable)
                ((Playable) a).play();
        }

    }
}
