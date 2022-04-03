package example01.i220401.Exam04;

public class HashMapNormalPractice {
    public static void main(String[] args) {
        // �ݰ� �ν��Ͻ� �����
        StrongBox guard = new StrongBox();
        // ��� �ܾ� ���� ����
        String secret = null ;
        try {
            // ù ��° ���� ����
            secret = "sgf01" ;
            guard.store(secret, new Treasure( "���̾" ));
            // �� ��° ������ ����
            secret = "zkq02" ;
            guard.store(secret, new Treasure( "���� �����" ));
            // �� ��° ������ ����
            secret = "xrt03" ;
            guard.store(secret, new Treasure( "�� ����" ));
            // �� ��° ������ ���� (��� �ܾ� �ߺ�)
            secret = "xrt03" ;
            guard.store (secret, new Treasure ( "��� �Ͱ���" ));
        } catch (DuplicateSecretException e) {
            System.out.println( "��� �ܾ� " +secret + "�� �̹� �پ� �ֽ��ϴ�" );
        }
        System.out.println();
        try {
            // ù ��° ���� ȹ��
            secret = "sgf01" ;
            Treasure treasure1 = guard.getTreasure(secret);
            System.out.println(treasure1 + "�� �޾ҽ��ϴ�!" );
            // �� ��° ���� ȹ��
            secret = "zkq02" ;
            Treasure treasure2 = guard.getTreasure(secret);
            System.out.println(treasure2 + "�� �޾ҽ��ϴ�!" );
            // �� ��° ������ ��´� (����� ���� ����)
            secret = "xrr03" ;
            Treasure treasure3 = guard.getTreasure(secret);
            System.out.println(treasure3 + "�� �޾ҽ��ϴ�!" );
        } catch (IllegalSecretException e) {
            System.out.println( "��� �ܾ� " + secret + "�� �Ǽ�" );
        }
    }
}
