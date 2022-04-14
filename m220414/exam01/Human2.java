package example01.m220414.exam01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record Human2(String name, int height, int weight, LocalDate birth) {

    public String getBirth() {
        return DateTimeFormatter.ofPattern("yyyy년MM월dd일(EEE)").format(birth);
    }

    @Override
    public String toString() {
        return "%s: %dcm %dkg %s출생".formatted(name.substring(1), height, weight, getBirth());
    }
}
