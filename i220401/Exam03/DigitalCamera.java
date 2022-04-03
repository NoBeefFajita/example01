package example01.i220401.Exam03;

import java.util.ArrayList;

public class DigitalCamera {

    private ArrayList<String> memory;

    public DigitalCamera() {
        this.memory = new ArrayList<>();
    }

    public void takePicture(String target) {
        System.out.println(target + "�� �Կ��߽��ϴ�.");
        this.memory.add(target);
    }

    public void showPictures() {
        System.out.println("�ڡ� �̹��� �϶� �١�");
        for(String target : memory) {
            System.out.println(target + "�̹���");
        }
    }

    public int getPictureCount() {
        return memory.size();
    }

    public void clearMemory() {
        memory.clear();
        System.out.println("��� �̹����� �����߽��ϴ�.");
    }



}
