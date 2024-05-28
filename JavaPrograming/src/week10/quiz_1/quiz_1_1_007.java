package easyjava.week10.quiz_1;

public class quiz_1_1_007 {
    public static void main(String[] args) {
        int dividend = 10; // 나눗셈의 피제수(분자)를 10으로 초기화

        try {
            // 명령행 인수를 정수로 변환하여 divisor 변수에 할당
            int divisor = Integer.parseInt(args[0]);
            // dividend를 divisor로 나눈 결과를 출력
            System.out.println(dividend / divisor);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 명령행 인수가 제공되지 않은 경우 예외 처리
            System.out.println("원소가 존재하지 않습니다.");
        } catch (NumberFormatException e) {
            // 명령행 인수가 정수로 변환할 수 없는 경우 예외 처리
            System.out.println("숫자가 아닙니다.");
        } catch (ArithmeticException e) {
            // divisor가 0인 경우(0으로 나누는 경우) 예외 처리
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            // 예외 발생 여부와 상관없이 항상 실행되는 블록
            System.out.println("항상 실행됩니다.");
        }

        // try-catch-finally 블록의 실행이 끝난 후 실행
        System.out.println("종료.");
    }
}
