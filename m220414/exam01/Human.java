package example01.m220414.exam01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Human {
    private String name;
    private double height;
    private double weight;
    private LocalDate birth;

    public Human(String name, double height, double weight, LocalDate birth) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getBirth() {
        return DateTimeFormatter.ofPattern("yyyy년MM월dd일(EEE)").format(birth);
    }



    @Override
    public String toString() {
        return "%s: %.0fcm %.0fkg %s출생".formatted(name.substring(1), height, weight, getBirth());
    }
}
