package easyjava.final_exam.week14.sec03_LazinessDemo;

import java.util.stream.IntStream;

// 느긋한 연산과 조급한 연산
public class Laziness1Demo {
    public static void main(String[] args) {
        // 1부터 5까지의 정수 스트림 생성
        IntStream is = IntStream.rangeClosed(1, 5);

        // 필터와 맵 연산을 스트림에 적용
        is.filter(x -> {
            // 필터 연산 중 요소 출력
            System.out.println("filter : " + x);
            // 짝수만 통과
            return x % 2 == 0;
        }).map(x -> {
            // 맵 연산 중 요소 출력
            System.out.println("map : " + x);
            // 요소를 제곱
            return x * x;
        });

        // 최종 연산이 없기 때문에 위의 중간 연산은 실제로 수행되지 않음
    }
}
