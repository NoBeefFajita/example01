package example01.k220412;

public class Exam05 {
    public static void main(String[] args) {

        Animal[] animals = {new Cat("일옹이", 2),
                            new Dog("일멍이", 3),
                            new Cat("이옹이", 4),
                            new Dog("이멍이", 5)};

        for(Animal pet: animals) {
            pet.speak();
        }
        animals[0].start();
        animals[1].start();
        animals[2].start();
        animals[3].start();
    }
}
