package example01.i220401;

import java.util.*;

public class Exam02 {
    public static void main(String[] args) {
        // 영숫자 단어 저장용 변수 선언 및 ArrayList 객체 생성
        ArrayList<String> number = new ArrayList<String>();
        // 영숫자 단어 저장
        number.add( "zero" );
        number.add( "one" );
        number.add( "two" );
        number.add( "three" );
        number.add( "four" );
        number.add( "five" );
        number.add( "six" );
        number.add( "seven" );
        number.add( "eight" );
        number.add( "nine" );
        number.add( "ten" );
        // 영어 단어 입력
        System.out.println ( "0에서 10까지의 영문 단어를 입력하십시오" );
        String input = System.console().readLine();
        // 여기에서 코딩하십시오.
        // input 과 일치 확인
//        int inputIdx = number.indexOf(input);
//
//        if(inputIdx != -1) {
//            System.out.printf("%s는 숫자의 %d\n", input, inputIdx);
//        } else {
//            System.out.println(inputIdx + "은 영어 단어로 존재하지 않습니다.");
//        }

        boolean check = true;

        for(int i = 0; i < number.size(); i++) {
            if(number.get(i).equals(input)) {
                System.out.printf("%s는 숫자의 %d\n", input, i);
                check = false;
            }
        }
        if(check)
            System.out.println(input + "은 영어 단어로 존재하지 않습니다.");
    }
}
