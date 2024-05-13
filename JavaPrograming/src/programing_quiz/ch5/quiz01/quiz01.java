package easyjava.programing_quiz.ch5.quiz01;

import java.util.Scanner;

// Scanner를 사용하여 사용자로부터 입력을 받아와 특정 문자열에서 특정 문자가 나타나는 횟수를 세는 프로그램
public class quiz01 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.print("입력하고 싶은 문자열 : ");
        String s = inScanner.next(); // 사용자로부터 문자열 입력받음

        System.out.print("찾고자 하는 문자 : ");
        String s2 = inScanner.next();
        char c = s2.charAt(0); // 사용자로부터 찾고자 하는 문자 입력받음

        // 입력받은 문자열과 문자를 전달하여 countChar 메서드 호출하여 문자열에서 문자가 나타나는 횟수 계산
        int count = countChar(s, c);
        System.out.println("\n" + count); // 계산된 횟수 출력
    }

    // 문자열에서 특정 문자가 나타나는 횟수를 계산하여 반환하는 메서드
    static int countChar(String s, char c) {
        int count = 0;
        // 문자열을 순회하면서 특정 문자가 나타나는 횟수를 세는 반복문
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count; // 계산된 횟수 반환
    }
}
