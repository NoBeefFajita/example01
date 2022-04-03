package example01.i220401.Exam03;

import java.util.ArrayList;

public class DigitalCamera {

    private ArrayList<String> memory;

    public DigitalCamera() {
        this.memory = new ArrayList<>();
    }

    public void takePicture(String target) {
        System.out.println(target + "을 촬영했습니다.");
        this.memory.add(target);
    }

    public void showPictures() {
        System.out.println("★☆ 이미지 일람 ☆★");
        for(String target : memory) {
            System.out.println(target + "이미지");
        }
    }

    public int getPictureCount() {
        return memory.size();
    }

    public void clearMemory() {
        memory.clear();
        System.out.println("모든 이미지를 삭제했습니다.");
    }



}
