package easyjava.programing_quiz2.ch08.quiz06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class quiz06 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println(ldt.format(fm1));
        System.out.println("오늘은 " + ldt.getMonthValue() + "월의 " + ldt.getDayOfMonth() + "번째 날");
        System.out.println("오늘은 " + ldt.getYear() + "년의 " + ldt.getDayOfYear() + "번째 날");
    }
}
