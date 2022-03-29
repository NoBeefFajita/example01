package example01.g220329;

public class Exam03 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random()*3);
        System.out.println("컴퓨터가 낸것: " + (
                            randomNum == 0? "가위" : randomNum==1? "보" : randomNum == 2? "바위":0));
    }
}
