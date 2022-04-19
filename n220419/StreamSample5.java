package example01.n220419;

import java.util.List;

public class StreamSample5 {
    public static void main(String[] args) {
        List<String> strs = List.of("apple", "banana", "orange", "pineapple");

        // 1
        strs.stream()
                .filter(s -> s.length() >= 6)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 2
        int total = (int)strs.stream()
                .filter(s -> s.length() >= 6)
                .count();
        System.out.println(total);

        // 3
        if(strs.stream()
                .allMatch(s -> s.contains("a"))) {
            System.out.println("YES");
        } else System.out.println("NO");

        // 4
        if(strs.stream()
                .anyMatch(s -> s.contains("c"))) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
