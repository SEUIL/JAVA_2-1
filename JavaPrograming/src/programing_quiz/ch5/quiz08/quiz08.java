package easyjava.programing_quiz.ch5.quiz08;

import java.util.Scanner;

public class quiz08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String putDay = scanner.next();

        Day day = Day.valueOf(putDay.toUpperCase());
        switch (day){
            case SUNDAY,SATURDAY -> System.out.println("최고");
            case MONDAY -> System.out.println("싫다.");
            case FRIDAY -> System.out.println("좋다.");
            default -> System.out.println("그저 그렇다.");
        }
    }
}
enum Day{
    SUNDAY("일요일"), MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일");
    private String s;
    Day(String s) {
        this.s = s;
    }
    public String toString() {
        return s;
    }
}