package easyjava.Quiz4_5_6;

import java.util.Scanner;

//영문 대문자로 요일(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY)을 나타내는
// 열거 타입을 정의하고 다음과 같은 실행 결과가 나타나는 테스트 프로그램을 작성하시오.
// - Switch 문으로 월요일에 대하여 ‘싫다‘, 금요일에 대하여 ‘좋다‘, 토요일과 일요일에 대하여
//‘최고‘, 나머지 요일에 대하여 ‘그저 그렇다＇라고 출력하는 dayIsLike() 메서드를 정의
//- 키보드로 부터 대소문자 구분 없는 영문 요일을 입력하면 ‘월요일은 싫다‘ 등과 같이 출력되는 메인
//프로그램을 작성
public class quiz5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Day day = Day.valueOf(s.toUpperCase());
        dayIsLike(day);
    }

    private static void dayIsLike(Day day) {
        switch (day){
            case MONDAY -> System.out.println("월요일은 싫다");
            case TUESDAY -> System.out.println("화요일은 그저 그렇다");
            case WEDNESDAY -> System.out.println("수요일은 그저 그렇다");
            case THURSDAY -> System.out.println("목요일은 그저 그렇다");
            case FRIDAY -> System.out.println("금요일은 좋다");
            case SATURDAY -> System.out.println("토요일은 최고");
            case SUNDAY -> System.out.println("일요일은 최고");
        }
    }

}
enum Day{
    SUNDAY,MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}