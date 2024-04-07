package easyjava.easyjava.chap12.src.challenge.two;

import java.util.*;
import java.util.stream.Stream;

public class DicTest {
    public static void main(String[] args) {
        Map<String, String> dic = Map.of("cat", "꼬네이",
                "head", "대가빠리", "aunt", "아지매",
                "noodle", "국시", "teacher", "쌤",
                "child", "얼라");

        Stream<Map.Entry<String, String>> sme = dic.entrySet().stream();
        Stream<String> smk = dic.keySet().stream();

        sme.forEach(e -> System.out.print(e + " "));
        System.out.println();
        smk.forEach(e -> System.out.print(e + " "));
//        dic.forEach((x, y) -> System.out.print(x + "=" + y + "  "));
//        System.out.println();
//
//        Collection<String> collection1 = dic.values();
//        List<String> list1 = new ArrayList<>(collection1);
//        Collections.shuffle(list1);
//        list1.forEach(x -> System.out.print(x + "  "));
//        System.out.println();
//
//        Collection<String> collection2 = dic.keySet();
//        collection2.forEach(x -> System.out.print(x + " "));
//        System.out.println();
//
//        Stream<String> stream = collection2.stream();
//        stream.sorted().filter(x -> x.length() > 4).forEach(x -> System.out.print(x + " "));
    }
}