package easyjava.programing_quiz.ch5.quiz01;

import java.util.Scanner;

public class quiz01 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.print("입력하고 싶은 문자열 : ");
        String s = inScanner.next();

        System.out.print("찾고자 하는 문자 : ");
        String s2 = inScanner.next();
        char c = s2.charAt(0);

        int count = countChar(s, c);
        System.out.println("\n" + count);
    }
    static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
