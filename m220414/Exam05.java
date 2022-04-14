package example01.m220414;

public class Exam05 {
    public static void main(String[] args) {
        char a = 0x21;
        while (a < 127) {
            System.out.println(a + " %04X".formatted((int)a++));
        }
    }
}
