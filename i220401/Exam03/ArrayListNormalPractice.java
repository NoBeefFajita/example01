package example01.i220401.Exam03;

public class ArrayListNormalPractice {
    public static void main(String[] args) {
        // 디지털 카메라 객체 선언 및 생성
        DigitalCamera myCamera = new DigitalCamera();
        // 디지털 카메라로 촬영
        myCamera.takePicture( "새끼 고양이" );
        myCamera.takePicture( "런치" );
        myCamera.takePicture( "카푸치노" );
        myCamera.takePicture( "아기" );
        myCamera.takePicture( "투샷" );
        System.out.println();
        // 촬영 이미지 수 확인
        System.out.println( "현재 촬영 매수:" + myCamera.getPictureCount());
        System.out.println();
        // 이미지 보기
        myCamera.showPictures();
        System.out.println();
        // 이미지 파일 지우기
        myCamera.clearMemory();
        System.out.println();
        // 촬영 이미지 수 재확인
        System.out.println( "현재 촬영 매수:" + myCamera.getPictureCount());
    }
}
