package easyjava.final_exam.week14.quiz_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 문자 스트림의 FileWriter로 텍스트 파일 저장
// Scanner로 입력 받은 이름과 전화번호를 한 사람씩
// d:\Temp\phone.txt 파일에 5개 저장하는 프로그램을 작성하시오.
// '그만'을 입력하면 프로그램을 종료한다.
public class quiz_2_007 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null; // FileWriter 객체 선언
        File f = new File("C:\\temp\\phone.txt"); // 저장할 파일 경로 설정

        try {
            fw = new FileWriter(f); // FileWriter 객체 초기화
            Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 초기화
            System.out.println("전화번호 입력 프로그램입니다."); // 안내 문구 출력

            // 무한 반복하여 사용자 입력을 받음
            while (true) {
                System.out.print("이름 전화번호 >> ");
                String line = scanner.nextLine(); // 한 줄을 읽음

                // 사용자가 '그만'을 입력하면 반복 종료
                if (line.equals("그만"))
                    break;

                fw.write(line + "\r\n"); // 입력 받은 내용을 파일에 저장하고 한 줄 띄기
            }

            System.out.println(f.getPath() + "에 저장하였습니다."); // 저장 완료 메시지 출력
            scanner.close(); // Scanner 객체 닫기
            fw.close(); // FileWriter 객체 닫기
        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
        }
    }
}
