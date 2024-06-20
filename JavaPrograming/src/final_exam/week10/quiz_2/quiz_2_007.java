package easyjava.final_exam.week10.quiz_2;

import java.util.Scanner;

public class quiz_2_007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner 객체를 생성하여 입력을 받기 위한 준비

        try {
            // 사용자가 입력한 문자열을 읽고 square 메서드에 전달
            System.out.print("입력 : ");
            square(in.nextLine());
        } catch (NumberFormatException e) {
            // 입력된 문자열이 정수로 변환할 수 없는 경우 예외 처리
            System.out.println("정수가 아닙니다.");
        }
    }

    private static void square(String s) throws NumberFormatException {
        // 문자열을 정수로 변환, 예외 발생 가능
        int n = Integer.parseInt(s); // Integer 클래스의 parseInt 메서드를 사용하여 문자열을 정수로 변환
        System.out.println(n * n); // 변환된 정수를 제곱하여 출력
    }
}
