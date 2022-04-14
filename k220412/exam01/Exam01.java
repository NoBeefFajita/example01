package example01.k220412.exam01;

import java.util.ArrayList;

public class Exam01 {
    public static void main(String[] args) {
        // 모금 상자 개체 얻기
        CollectionBox cb = CollectionBox.getInstance();
        // 가짜 모금 상자를 만들 수 없도록 하기(컴파일 오류)
        // CollectionBox imitation = new CollectionBox();
        // 5명의 부자(백만장자) 객체 생성
//        ArrayList<MultiMillionaire> mm = new ArrayList<>();
//        for (int i = 0; i < 8; i ++){
//            mm.add(new MultiMillionaire(cb));
//        }
        MultiMillionaire mm1 = new MultiMillionaire(cb);
        MultiMillionaire mm2 = new MultiMillionaire(cb);
        MultiMillionaire mm3 = new MultiMillionaire(cb);
        MultiMillionaire mm4 = new MultiMillionaire(cb);
        MultiMillionaire mm5 = new MultiMillionaire(cb);
        // 모금 시작
//        mm.get(0).start();
//        mm.get(1).start();
//        mm.get(2).start();
//        mm.get(3).start();
//        mm.get(4).start();
//        mm.get(5).start();
//        mm.get(6).start();
//        mm.get(7).start();
        mm1.start();
        mm2.start();
        mm3.start();
        mm4.start();
        mm5.start();
        // 모든 사람의 모금이 끝날 때까지 기다립니다.
        try {
//            mm.get(0).join();
//            mm.get(1).join();
//            mm.get(2).join();
//            mm.get(3).join();
//            mm.get(4).join();
//            mm.get(5).join();
//            mm.get(6).join();
//            mm.get(7).join();
            mm1.join();
            mm2.join();
            mm3.join();
            mm4.join();
            mm5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 모금 총액 발표
        System.out.println( "모금 총액: " + cb.getTotalAmount() + "원" );
    }
}