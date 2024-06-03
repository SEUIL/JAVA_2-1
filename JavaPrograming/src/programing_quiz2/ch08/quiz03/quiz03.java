package easyjava.programing_quiz2.ch08.quiz03;

import java.util.Calendar;

public class quiz03 {
    public static void main(String[] args) {
        // 요일과 오전/오후를 나타내는 문자열 배열 생성
        String[] weekName = { "일", "월", "화", "수", "목", "금", "토" };
        String[] noonName = { "오전", "오후" };

        // 현재 시간 정보를 가지고 있는 Calendar 객체 생성
        Calendar c = Calendar.getInstance();

        // Calendar 객체에 원하는 시간 설정
        c.set(2017, 6, 15, 15, 33, 40);

        // Calendar 객체에서 년, 월, 일, 요일, 오전/오후, 시, 분, 초 정보 추출
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더해준다.
        int day = c.get(Calendar.DATE);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String week = weekName[dayOfWeek - 1]; // 요일을 문자열로 변환
        int ampm = c.get(Calendar.AM_PM);
        String noon = noonName[ampm]; // 오전/오후를 문자열로 변환
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        // 출력
        System.out.println(year + "년 " + month + "월 " + day + "일 ");
        System.out.println(week + "요일 " + noon);
        System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
    }
}
