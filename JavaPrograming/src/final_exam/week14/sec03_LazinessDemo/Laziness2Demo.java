package easyjava.final_exam.week14.sec03_LazinessDemo;

import java.util.stream.IntStream;

// 느긋한 연산과 조급한 연산
public class Laziness2Demo {
    public static void main(String[] args) {
        // 1부터 5까지의 정수 스트림 생성
        IntStream is = IntStream.rangeClosed(1, 5);

        // 필터와 맵 연산을 스트림에 적용 후 forEach로 최종 연산 진행
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
        }).forEach(x ->
                // 최종 연산 중 요소 출력
                System.out.println("forEach : " + x)
        );
    }
}
