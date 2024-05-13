package easyjava.programing_quiz.ch4.quiz06;

// 테스트를 위한 메인 클래스
public class quiz06 {
    public static void main(String[] args) {
        // 복소수 객체 생성
        Complex c1 = new Complex(2.0); // 실수 부분만 있는 복소수 객체 생성
        c1.print(); // 복소수 출력
        Complex c2 = new Complex(1.5,2.5); // 실수 부분과 허수 부분이 있는 복소수 객체 생성
        c2.print(); // 복소수 출력
    }
}

// 복소수를 나타내는 클래스
class Complex{
    static double num1; // 실수 부분을 나타내는 정적 변수
    static double num2; // 허수 부분을 나타내는 정적 변수

    // 실수 부분만 있는 복소수를 초기화하는 생성자
    Complex(double num1){
        this.num1 = num1;
    }

    // 실수 부분과 허수 부분이 있는 복소수를 초기화하는 생성자
    Complex(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // 복소수를 출력하는 메서드
    void print(){
        System.out.println(num1 + " + " + num2 + "i");
    }
}
