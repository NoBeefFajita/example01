package example01.e220325;

public class Practice3 {
    public static void main(String[] args) {
        Person ps1 = new Person();
        ps1.setData("홍길동", 30);

        Person ps2 = new Person();
        ps2.setData("이순신", 31);

        Person ps3 = new Person();
        ps3.setData("이산", 33);

        ps1.introduce();
        ps2.introduce();
        ps3.introduce();

        System.out.println();

        ps2.compare("강산", 31);
        ps3.compare("이이", 31);
        ps2.compare("유홍", 33);

    }
}

class Person {
    private String name;
    private int age;

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void introduce() {
        System.out.println("내 이름은 " + this.name + ", 나이는 " + this.age + "입니다.");
    }

    public void compare(String name, int age) {
        if(this.age == age)
            System.out.println("나는 " + name + "이고 " + this.name + "님과 같은 나이입니다.");
        else if (this.age < age)
            System.out.println("나는 " + name + "이고 " + this.name + "님보다 " + Math.abs(this.age - age) + "살 연상입니다.");
        else if (this.age > age)
            System.out.println("나는 " + name + "이고 " + this.name + "님보다 " + Math.abs(this.age - age) + "살 연하입니다.");
    }
}
