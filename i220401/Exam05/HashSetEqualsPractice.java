package example01.i220401.Exam05;

import java.util.*;

public class HashSetEqualsPractice {
    public static void main(String[] args) {
        // �׷� �Ἲ
        HashSet<Member> group = new HashSet<Member>();
        // ȸ�� �߰�
        group.add( new Member( 1 , "ȫ�浿" ));
        group.add( new Member( 2 , "�̼���" ));
        group.add( new Member( 3 , "�����ҹ�" ));
        group.add( new Member( 4 , "��������" ));
        group.add( new Member( 5 , "�������" ));
        // �ӽ� ����� �߰�!
        group.add( new Member( 1 , "�����" ));
        // ��� �Ұ�
        for (Member member : group) {
            System.out.println(member);
        }
    }
}
