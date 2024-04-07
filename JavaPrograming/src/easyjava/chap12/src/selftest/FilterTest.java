package selftest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
        List<String> lists = List.of("사과", "배", "바나나", "딸기");
        lists.stream().filter(s -> s.length() == 2).forEach(System.out::println);

        Map<Boolean, List<String>> fruits = lists.stream().collect(Collectors.partitioningBy(s -> s.length() == 2));
        System.out.println(fruits);

        List<Integer> l1 = List.of(1, 2);
        List<Integer> l2 = List.of(3, 4, 5);

        List<List<Integer>> listOflists = List.of(List.of(1, 2), List.of(3, 4, 5));
        List<Integer> listOfIntegers = listOflists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(listOfIntegers);
    }
}
