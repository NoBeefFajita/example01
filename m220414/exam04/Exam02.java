package example01.m220414.exam04;

import java.util.ArrayList;

public class Exam02 {
    public static void main(String[] args) {
        ArrayList<Coordination> cd = new ArrayList<>();

        while (cd.size() <= 15) {
            cd.add(new Coordination(0,0));
        }
    }
}
