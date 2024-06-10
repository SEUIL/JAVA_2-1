package easyjava.final_exam.week14.quiz_3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// 문자 스트림의 FileReader로 텍스트 파일 읽기
// quiz_2_식별자 문제에서 d:\Temp\phone.txt 파일에 저장한 내용을 읽어 화면에 출력하는 프로그램을 작성하시오.
// => 문자 스트림의 FileReader로 텍스트 파일 읽기와 Scanner를 이용한 파일 읽기
public class quiz_3_1_007 {
    public static void main(String[] args) {
        FileReader fr = null; // FileReader 객체 선언
        File f = new File("C:\\temp\\phone.txt"); // 읽을 파일 경로 설정

        try {
            fr = new FileReader(f); // FileReader 객체 초기화
            System.out.println(f.getPath() + "를 출력합니다."); // 파일 경로 출력

            // 파일의 내용을 한 문자씩 읽어서 출력
            while (true) {
                int c = fr.read(); // 한 문자를 읽음
                if (c == -1) // 파일 끝에 도달하면 반복 종료
                    break;
                System.out.print((char) c); // 읽은 문자를 출력
            }

            fr.close(); // FileReader 객체 닫기
        } catch (IOException e) { // 파일을 읽을 수 없는 경우 예외 처리
            e.printStackTrace();
        }
    }
}
