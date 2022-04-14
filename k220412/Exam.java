package example01.k220412;

public class Exam {
    public static void main(String[] args) {
        Cat cat = new Cat("야옹이",3);
        Dog dog = new Dog("멍멍이",2);

        cat.showProfile();
        dog.showProfile();

        cat.sleep();
        dog.run();

        cat.speak();
        dog.speak();
    }
}
