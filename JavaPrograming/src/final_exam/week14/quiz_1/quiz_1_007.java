package easyjava.final_exam.week14.quiz_1;

import java.util.List;
import java.util.stream.Stream;

//스트림을 이용
//List컬렉션을 데이터 소스로 사용하여 스트림을 생성 한 후
//다양한 스트림 연산 작업을 수행하는 프로그램을 작성하시오.
public class quiz_1_007 {
    public static void main(String[] args) {
        // Stream 객체를 선언합니다.
        Stream<String> ss;

        // 이름 목록을 List로 초기화합니다.
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");

        // 스트림을 생성하고, 이름의 첫 글자가 '이'보다 작은 이름을 필터링하여 출력합니다.
        ss = names.stream();
        ss.filter(n -> n.charAt(0) < '이').forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 스트림을 다시 생성하고, 이름을 정렬하여 출력합니다.
        ss = names.stream();
        ss.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
