package easyjava.final_exam.week14.quiz_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

// 행맨 게임 만들기 (BufferedReader 활용)
// 주어진 단어를 문자 하나씩 추측해서 맞추는 행맨(hangman) 프로그램을 작성하시오.
// - 처음에는 단어에 포함된 문자의 개수만큼 빈칸이 나타나며, 사용자는 빈칸에 들어갈 문자를 하나씩 추측한다.
// - 추측한 문자가 맞으면 빈칸 대신에 맞춘 문자를 출력한다.
// - 프로그램에서 사용할 문자열은 12개의 단어로 구성된 D:\Temp\words.txt 파일에 있는 문자열 중 무작위로 선택한다.
// - 여섯 번을 초과해서 잘못된 추측을 하면 게임이 종료된다.
public class quiz_6_007 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char again = 'n'; // 사용자가 게임을 다시 할지 결정하는 변수
        String secret; // 랜덤으로 선택된 단어
        StringBuffer dashes; // 단어 길이만큼의 빈칸을 나타내는 StringBuffer
        int leftCount; // 남은 추측 횟수
        boolean done; // 게임이 끝났는지 여부
        String guess; // 사용자가 입력한 추측 문자
        String guesses; // 지금까지 사용자가 추측한 문자들
        char letter; // 사용자가 입력한 문자
        Words words = new Words("D:\\temp\\words.txt"); // 단어를 불러올 Words 객체

        do {
            secret = words.getRandomWord(); // 랜덤으로 단어 선택
            guesses = ""; // 추측한 문자를 저장할 문자열 초기화
            done = false; // 게임 종료 여부 초기화
            leftCount = 6; // 남은 추측 횟수 초기화
            dashes = makeDashes(secret); // 단어 길이만큼의 빈칸 생성

            while (!done) {
                System.out.println("추측할 단어입니다 : " + dashes);
                System.out.println("지금까지 추측한 내용입니다 : " + guesses);
                System.out.print("추측한 문자를 입력하세요 : ");
                guess = in.next(); // 사용자가 입력한 문자

                if (guess.length() > 1) { // 사용자가 한 글자 이상 입력했을 때
                    if (guess.equals(secret))
                        System.out.println("승리!");
                    else
                        System.out.println("실패.");
                    done = true;
                } else {
                    letter = guess.charAt(0); // 한 글자 입력
                    guesses += letter; // 추측한 문자 저장
                    if (secret.indexOf(letter) < 0) { // 틀린 추측
                        --leftCount;
                        System.out.print("추측을 잘못했습니다 - ");
                    } else
                        matchLetter(secret, dashes, letter); // 맞춘 문자 빈칸에 채우기
                    System.out.println(leftCount + "번 더 추측할 수 있습니다.");
                    if (leftCount == 0) { // 남은 추측 횟수가 0이면 게임 종료
                        System.out.println("실패.");
                        done = true;
                    }
                    if (secret.equals(dashes.toString())) { // 모든 문자를 맞추면 게임 승리
                        System.out.println("승리!");
                        done = true;
                    }
                }
            }
            System.out.print("한 번 더 게임할래요 (y/n)?: ");
            again = in.next().charAt(0); // 다시 할지 여부 입력
        } while (again == 'Y' || again == 'y'); // 사용자가 'Y' 또는 'y'를 입력하면 게임 다시 시작
    }

    // 단어에서 맞춘 문자를 빈칸에 채우는 메소드
    public static void matchLetter(String secret, StringBuffer dashes, char letter) {
        for (int index = 0; index < secret.length(); index++)
            if (secret.charAt(index) == letter)
                dashes.setCharAt(index, letter);
        System.out.print("정확한 추측입니다 - ");
    }

    // 단어 길이만큼 빈칸을 생성하는 메소드
    public static StringBuffer makeDashes(String s) {
        StringBuffer dashes = new StringBuffer(s.length());
        for (int count = 0; count < s.length(); count++)
            dashes.append('-');
        return dashes;
    }
}

// 단어 파일을 읽어 무작위로 단어를 선택하는 클래스
class Words {
    private String fileName; // 파일 이름
    private Random r = new Random(); // 랜덤 객체

    public Words(String fileName) {
        this.fileName = fileName;
    }

    // 파일에서 무작위로 단어를 선택하는 메소드
    public String getRandomWord() {
        String line = null;
        int n = r.nextInt(10); // 0에서 9 사이의 랜덤 숫자 선택
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            while (n-- >= 0)
                line = in.readLine(); // 랜덤 숫자만큼 줄을 내려가서 단어 선택
        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }
}
