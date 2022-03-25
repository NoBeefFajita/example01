package example01.e220325;

public class Practice5 {
    public static void main(String[] args) {
        // Square 클래스 객체 만들기
        Square square = new Square(4.5, 2.8);
        // 사각형 정보 출력
        square.inform();
        // 면적표시
        System.out.println("이 사격형 면적은 " + square.getArea() + "입니다.");
        // 너비를 3.0 증가
        square.addWidth(3.0);
        System.out.println();
        // 사각형 정보 출력
        square.inform();
        // 면적표시
        System.out.println("이 사각형 면적은 " + square.getArea() + "입니다.");
    }

}

class Square {
    private double width;
    private double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void inform() {
        System.out.println("이 사각형의 너비는 " + this.width + " 이고 높이는 " + this.height + " 입니다.");
    }

    public double getArea() {
        double area = this.width * this.height;
        return area;
    }

    public void addWidth(double width) {
        this.width += width;
    }
}