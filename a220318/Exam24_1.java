package example01.JavaPractice;

public class Exam24_1 {

    public static void main(String... args) {

        for(int i = 1; i<=20; i++) {
            if(i % 5 ==0){
                System.out.println("- ");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
