package example01.k220412;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void run() {
        System.out.println("달려 달려");
    }

    @Override
    public void speak() {
        System.out.println("멍멍");
    }

//    @Override
//    public void run() {
//        System.out.println("왈왈");
//    }
}
