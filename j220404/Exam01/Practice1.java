package example01.j220404.Exam01;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Animal> animals;// 3마리의 동물들을 나타내는 Animal 서열형 변수 animals의 선언과
        animals = new ArrayList<>();// 배열 객체 생성
        animals.add(new Dog());// 동물들 배열 변수의 각 요소에 차례로 개, 고양이, 새
        animals.add(new Cat());// 객체 생성 및 할당
        animals.add(new Bird());

        for (Animal animal: animals) { // for 루프를 사용하여 동물들의 배열 변수를 순서대로 살펴 보겠습니다.
            System.out.println(animal.getClass());
        }

        for (Animal animal: animals) {
            animal.sing();// 각 동물의 노래하는 sing 메서드 호출
        }
    }
}