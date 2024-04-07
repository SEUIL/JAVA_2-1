package week03.w3_007;
import java.util.Scanner;
public class quiz5_2_007 {
    //2133007
    //황스일
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("대소문자 상관없이 영어로 요일을 입력하시오");
        String s = in.next();
        Day day = Day.valueOf(s.toUpperCase());
        //.toUpperCase() : 대소문자 상관없이 대문자로 변환하는 함수
        dayIsLike(day);

    }
    public static void dayIsLike(Day day) {
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
