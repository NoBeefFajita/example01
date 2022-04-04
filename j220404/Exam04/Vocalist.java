package example01.j220404.Exam04;

public class Vocalist extends Musician implements Singable{

    public Vocalist(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println(getName() + "은 열창했습니다!");
    }
}
