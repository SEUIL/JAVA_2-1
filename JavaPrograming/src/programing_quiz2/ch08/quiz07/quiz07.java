package easyjava.programing_quiz2.ch08.quiz07;

import java.text.MessageFormat;

// 테스트용 클래스
public class quiz07 {
    public static void main(String[] args) {
        // 데이터 배열 생성
        Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

        // 데이터 배열을 순회하며 각 요소를 출력
        for (Object[] person : data) {
            String name = (String) person[0]; // 이름
            int number = (int) person[1]; // 번호
            String nationality = (String) person[2]; // 국적

            // MessageFormat을 사용하여 형식화된 문자열 생성
            String formatted = MessageFormat.format("이름 : {0}\t번호 : {1}\t국적 : {2}", name, number, nationality);
            System.out.println(formatted); // 생성된 문자열 출력
        }
    }
}
