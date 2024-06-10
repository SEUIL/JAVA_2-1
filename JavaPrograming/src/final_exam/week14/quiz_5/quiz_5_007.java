package easyjava.final_exam.week14.quiz_5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

// HashMap 컬렉션과 파일
// 전화번호를 미리 d:\Temp\phone.txt 파일에 5개 저장해 둔다.
// 이 파일을 읽어 다음 실행 예시와 같은 작동하는 검색 프로그램을 작성하시오.
// => 이름을 ‘키’로 하고 전화 번호를 ‘값‘으로 하는 HashMap<String, String>을 이용하고,
// 한 라인씩 읽어 이름과 전화번호를 해시맵에 저장하고, 사용자의 이름을 입력 받아 검색한다.
public class quiz_5_007 {
    private String fileName = "C:\\temp\\phone.txt"; // 파일 경로 설정
    private HashMap<String, String> phoneMap = new HashMap<String, String>(); // 전화번호를 저장할 해시맵

    // 파일을 읽어 해시맵에 저장하는 메소드
    private void readPhoneFile() {
        try {
            Scanner fScanner = new Scanner(new FileReader(new File(fileName))); // 파일을 읽기 위한 Scanner 객체 초기화
            while (fScanner.hasNext()) {
                String name = fScanner.next(); // 이름 읽기
                String tel = fScanner.next(); // 전화번호 읽기
                phoneMap.put(name, tel); // 해시맵에 이름과 전화번호 저장
            }
            fScanner.close(); // Scanner 객체 닫기
        } catch (IOException e) { // 파일을 읽을 수 없는 경우 예외 처리
            e.printStackTrace();
        }
        System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다."); // 읽은 전화번호 수 출력
    }

    // 사용자 입력을 받아 전화번호를 검색하는 메소드
    private void processQuery() {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 초기화
        while (true) {
            System.out.print("이름>> ");
            String name = scanner.next(); // 이름 입력 받기
            if (name.equals("그만")) break; // '그만'을 입력하면 반복 종료
            String tel = phoneMap.get(name); // 해시맵에서 전화번호 검색
            if (tel == null) {
                System.out.println("찾는 이름이 없습니다."); // 검색 결과가 없을 경우 출력
            } else {
                System.out.println(tel); // 검색 결과 출력
            }
        }
        scanner.close(); // Scanner 객체 닫기
    }

    // 프로그램 실행 메소드
    public void run() {
        readPhoneFile(); // 파일 읽기
        processQuery(); // 사용자 입력 처리
    }

    public static void main(String[] args) {
        quiz_5_007 phoneExplorer = new quiz_5_007(); // 프로그램 객체 생성
        phoneExplorer.run(); // 프로그램 실행
    }
}
