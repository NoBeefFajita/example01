package example01.i220401.Exam05;

import java.util.*;

public class HashSetEqualsPractice {
    public static void main(String[] args) {
        // 그룹 결성
        HashSet<Member> group = new HashSet<Member>();
        // 회원 추가
        group.add( new Member( 1 , "홍길동" ));
        group.add( new Member( 2 , "이순신" ));
        group.add( new Member( 3 , "연개소문" ));
        group.add( new Member( 4 , "광개토대왕" ));
        group.add( new Member( 5 , "세종대왕" ));
        // 임시 멤버로 추가!
        group.add( new Member( 1 , "김재우" ));
        // 멤버 소개
        for (Member member : group) {
            System.out.println(member);
        }
    }
}
