package easyjava.programing_quiz2.ch08.quiz07;

import java.text.MessageFormat;

public class quiz07 {
    public static void main(String[] args) {
        Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

        for (Object[] person : data) {
            String name = (String) person[0];
            int number = (int) person[1];
            String nationality = (String) person[2];

            String formatted = MessageFormat.format("이름 : {0}\t번호 : {1}\t국적 : {2}", name, number, nationality);
            System.out.println(formatted);
        }
    }
}

