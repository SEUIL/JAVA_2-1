package easyjava.programing_quiz2.ch08.quiz03;

import java.util.Calendar;

public class quiz03 {
    public static void main(String[] args) {
        String[] weekName = { "일", "월", "화", "수", "목", "금", "토" };
        String[] noonName = { "오전", "오후" };
        Calendar c = Calendar.getInstance();

        c.set(2017, 6, 15, 15, 33, 40);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        String week = weekName[Calendar.THURSDAY - 1];
        String noon = noonName[Calendar.PM];
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        // 코드 추가

        System.out.println(year + "년 " + month + "월 " + day + "일 ");
        System.out.println(week + "요일 " + noon);
        System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
    }
}
