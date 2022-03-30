package example01.c220322;

public class ExerciseMethod01 {
    public static void main(String[] args) {
        gugudan(6);
    }

    static void gugudan(int dan) {
        for (int i = 1; i < 10; i++){
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
