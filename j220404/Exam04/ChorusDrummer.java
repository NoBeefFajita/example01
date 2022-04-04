package example01.j220404.Exam04;

public class ChorusDrummer extends Musician implements Singable,Playable{

    public ChorusDrummer(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println(getName() + "는 코러스를 연주했습니다!");
    }

    @Override
    public void play() {
        System.out.println(getName() + "는 드럼을 연주했습니다!");
    }
}
