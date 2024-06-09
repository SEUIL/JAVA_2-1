package easyjava.programing_quiz2.ch10.quiz01;

import java.util.Arrays;

public class quiz01 {
    public static void main(String[] args) {
        // 문자열 배열을 초기화합니다.
        String[] array = {"K", "o", "r", "e", "a", "n"};

        // 정렬 전의 배열을 출력합니다.
        System.out.println("정렬 전 : " + String.join(" ", array));

        // 람다식을 이용하여 배열을 정렬합니다.
        // 문자열 비교 시 대소문자를 구분하지 않고 정렬합니다.
        Arrays.sort(array, (s1, s2) -> s1.compareToIgnoreCase(s2));
        //Arrays.sort(array, String::compareToIgnoreCase);

        // 정렬 후의 배열을 출력합니다.
        System.out.println("정렬 후 : " + String.join(" ", array));
    }
}
