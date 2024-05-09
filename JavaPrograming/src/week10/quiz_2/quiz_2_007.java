package easyjava.week10.quiz_2;

import java.util.Scanner;

public class quiz_2_007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            square(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("정수가 아닙니다.");
        }
    }

    private static void square(String s) throws NumberFormatException {
        int n = Integer.parseInt(s); //예외가 발생
        System.out.println(n * n);
    }
}
