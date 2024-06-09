package easyjava.final_exam.week11.quiz_6.quiz6_2;
// Negative 인터페이스 정의, 하나의 메서드 neg를 포함
interface Negative {
    int neg(int x);
}
// Printable 인터페이스 정의, 하나의 메서드 print를 포함
interface Printable {
    void print();
}
// 메인 클래스 정의
public class quiz6_2_007 {
    public static void main(String[] args) {
        // 익명 지역 클래스 (Anonymous Inner Class)를 사용하여 Negative 인터페이스 구현
        Negative n = new Negative() {
            @Override
            public int neg(int x) {
                // 입력된 정수 x의 음수 반환
                return -x;
            }
        };
        // neg 메서드를 호출하여 10의 음수를 출력
        System.out.println(n.neg(10));  // 출력: -10

        // 익명 지역 클래스를 사용하여 Printable 인터페이스 구현
        Printable p = new Printable() {
            @Override
            public void print() {
                // "안녕!" 문자열 출력
                System.out.println("안녕!");
            }
        };
        // print 메서드를 호출하여 "안녕!"을 출력
        p.print();  // 출력: 안녕!
    }
}
