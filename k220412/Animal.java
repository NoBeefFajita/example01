package example01.k220412;

public class Animal extends Thread{
    public String Name;
    public int Age;

    public Animal(String name, int age) {
        Name = name;
        Age = age;
    }

    public void showProfile()
    {
        System.out.println("이름은 " + Name + "이고 " + Age + "살입니다." );
    }

    public void speak() {
        System.out.println("......");
    }

    public void run() {
        System.out.println("//////");
    }
}
