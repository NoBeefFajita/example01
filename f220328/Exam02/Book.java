package example01.f220328.Exam02;

public class Book {
    // 제목
    private String title;
    // 가격
    private int price;
    // 생성자
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    // 제목 얻기
    public String getTitle() {
        return title;
    }
    // 가격 얻기
    public int getPrice() {
        return price;
    }
}
