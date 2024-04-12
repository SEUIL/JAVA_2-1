package easyjava.week06.quiz7_3_2;

import java.util.Scanner;

public class quiz7_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수와 연산자를 입력하시오 : ");
        int a = scanner.nextInt();
        char operator = scanner.next().charAt(0);//연산자를 문자로 변환
        int b = scanner.nextInt();

        Calc exp;
        switch (operator) {
            case '+':
                exp = new Add();
                break;
            case '-':
                exp = new Sub();
                break;
            case '*':
                exp = new Mul();
                break;
            case '/':
                exp = new Div();
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        } //switch end

        exp.setValue(a, b); // 피연산자 a와 b 값을 객체에 저장
        if (exp instanceof Div && b == 0){ // 0으로 나누는 경우
            System.out.println("계산할 수 없습니다.");
        }else{
            System.out.println( exp.calculate());
        }
    }
}
