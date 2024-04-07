package challenge.two;

import java.util.List;
import java.util.stream.Stream;

public class CapitalDemo {
    public static void main(String[] args) {
        List<String> capitals = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");

        Stream<String> ss = capitals.stream();
        ss.filter(c -> c.length() < 3).forEach(System.out::println);
        ss = capitals.stream();
        ss.sorted().forEach(System.out::println);
        ss = capitals.stream();
        System.out.println(ss.findFirst());
        ss = capitals.stream();
        System.out.println(ss.findFirst().get());
        ss = capitals.stream();
        System.out.println(ss.count());
    }
}
