package easyjava.week11.quiz_6.quiz6_3;

// Negative 인터페이스 정의, 하나의 메서드 neg를 포함
interface Negative {
    int neg(int x);
}

// Printable 인터페이스 정의, 하나의 메서드 print를 포함
interface Printable {
    void print();
}

// Negative와 Printable 인터페이스를 구현하는 클래스 정의
public class quiz6_3_007 implements Negative, Printable {
    // Negative 인터페이스의 neg 메서드를 구현
    public int neg(int x) {
        // 입력된 정수 x의 음수를 반환
        return -x;
    }

    // Printable 인터페이스의 print 메서드를 구현
    public void print() {
        // "안녕" 문자열을 출력
        System.out.println("안녕");
    }

    // 메인 메서드
    public static void main(String[] args) {
        // quiz6_3_007 클래스의 인스턴스 생성
        quiz6_3_007 q = new quiz6_3_007();

        // neg 메서드를 호출하여 10의 음수를 출력
        System.out.println(q.neg(10));  // 출력: -10

        // print 메서드를 호출하여 "안녕"을 출력
        q.print();  // 출력: 안녕
    }
}
