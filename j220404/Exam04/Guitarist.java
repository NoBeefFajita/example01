package example01.j220404.Exam04;

public class Guitarist extends Musician implements Playable{

    private String guitarType;

    public Guitarist(String name, String guitarType) {
        super(name);
        this.guitarType = guitarType;
    }

    @Override
    public void play() {
        System.out.println(getName() + "는 " + guitarType + "을 연주했습니다!");
    }
}
