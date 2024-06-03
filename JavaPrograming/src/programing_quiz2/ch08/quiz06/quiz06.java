package easyjava.programing_quiz2.ch08.quiz06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 테스트용 클래스
public class quiz06 {
    public static void main(String[] args) {
        // 현재 시각을 나타내는 LocalDateTime 객체 생성
        LocalDateTime ldt = LocalDateTime.now();

        // 원하는 형식의 문자열로 변환하기 위한 DateTimeFormatter 객체 생성
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        // 현재 시각을 지정된 형식으로 출력
        System.out.println(ldt.format(fm1));

        // 월과 일을 출력
        System.out.println("오늘은 " + ldt.getMonthValue() + "월의 " + ldt.getDayOfMonth() + "번째 날");

        // 년과 해당 년의 일 수를 출력
        System.out.println("오늘은 " + ldt.getYear() + "년의 " + ldt.getDayOfYear() + "번째 날");
    }
}
