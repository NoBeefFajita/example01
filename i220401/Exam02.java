package example01.i220401;

import java.util.*;

public class Exam02 {
    public static void main(String[] args) {
        // ������ �ܾ� ����� ���� ���� �� ArrayList ��ü ����
        ArrayList<String> number = new ArrayList<String>();
        // ������ �ܾ� ����
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
        // ���� �ܾ� �Է�
        System.out.println ( "0���� 10������ ���� �ܾ �Է��Ͻʽÿ�" );
        String input = System.console().readLine();
        // ���⿡�� �ڵ��Ͻʽÿ�.
        // input �� ��ġ Ȯ��
//        int inputIdx = number.indexOf(input);
//
//        if(inputIdx != -1) {
//            System.out.printf("%s�� ������ %d\n", input, inputIdx);
//        } else {
//            System.out.println(inputIdx + "�� ���� �ܾ�� �������� �ʽ��ϴ�.");
//        }

        boolean check = true;

        for(int i = 0; i < number.size(); i++) {
            if(number.get(i).equals(input)) {
                System.out.printf("%s�� ������ %d\n", input, i);
                check = false;
            }
        }
        if(check)
            System.out.println(input + "�� ���� �ܾ�� �������� �ʽ��ϴ�.");
    }
}
