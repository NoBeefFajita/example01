package example01.i220401.Exam03;

public class ArrayListNormalPractice {
    public static void main(String[] args) {
        // ������ ī�޶� ��ü ���� �� ����
        DigitalCamera myCamera = new DigitalCamera();
        // ������ ī�޶�� �Կ�
        myCamera.takePicture( "���� �����" );
        myCamera.takePicture( "��ġ" );
        myCamera.takePicture( "īǪġ��" );
        myCamera.takePicture( "�Ʊ�" );
        myCamera.takePicture( "����" );
        System.out.println();
        // �Կ� �̹��� �� Ȯ��
        System.out.println( "���� �Կ� �ż�:" + myCamera.getPictureCount());
        System.out.println();
        // �̹��� ����
        myCamera.showPictures();
        System.out.println();
        // �̹��� ���� �����
        myCamera.clearMemory();
        System.out.println();
        // �Կ� �̹��� �� ��Ȯ��
        System.out.println( "���� �Կ� �ż�:" + myCamera.getPictureCount());
    }
}
