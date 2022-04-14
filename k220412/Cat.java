package example01.k220412;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name,age);
    }

    public void sleep() {
        System.out.println("야오야오");
    }

    @Override
    public void speak() {
        System.out.println("야옹야옹");
    }

    @Override
    public void run() {
        System.out.println("야옹야옹");
    }
}
