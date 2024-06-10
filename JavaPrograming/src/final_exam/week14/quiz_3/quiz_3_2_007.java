package easyjava.final_exam.week14.quiz_3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class quiz_3_2_007 {
    public static void main(String[] args) {
        FileReader fr = null; // FileReader 객체 선언
        File f = new File("c:\\temp\\phone.txt"); // 읽을 파일 경로 설정

        try {
            fr = new FileReader(f); // FileReader 객체 초기화
            Scanner scanner = new Scanner(fr); // FileReader를 사용하는 Scanner 객체 초기화
            System.out.println(f.getPath() + "를 출력합니다."); // 파일 경로 출력

            // 파일의 내용을 한 줄씩 읽어서 출력
            while (scanner.hasNext()) {
                String line = scanner.nextLine(); // 한 줄을 읽음
                System.out.println(line); // 읽은 줄을 출력
            }

            fr.close(); // FileReader 객체 닫기
            scanner.close(); // Scanner 객체 닫기
        } catch (IOException e) { // 파일을 읽을 수 없는 경우 예외 처리
            e.printStackTrace();
        }
    }
}
