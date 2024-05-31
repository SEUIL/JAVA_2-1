package easyjava.week11.quiz_6.quiz6_1;

// Negative 인터페이스 정의, 하나의 메서드 neg를 포함
interface Negative {
    int neg(int x);
}

// Printable 인터페이스 정의, 하나의 메서드 print를 포함
interface Printable {
    void print();
}

public class quiz_6_1_007 {
    public static void main(String[] args) {
        // Negative 타입의 변수 n 선언
        Negative n;

        // 람다 표현식으로 Negative 인터페이스의 neg 메서드 구현
        n = (int x) -> { return -x; };

        // neg 메서드를 호출하여 10의 음수를 출력
        System.out.println(n.neg(10));  // 출력: -10

        // Printable 타입의 변수 p 선언
        Printable p;

        // 람다 표현식으로 Printable 인터페이스의 print 메서드 구현
        p = () -> System.out.println("안녕!");

        // print 메서드를 호출하여 "안녕!"을 출력
        p.print();  // 출력: 안녕!
    }
}
