package easyjava.final_exam.week09.quiz_6;

public class quiz_6_007 {
    public static void main(String[] args) {
        // 반지름이 3인 Circle 객체 c1을 생성
        Circle c1 = new Circle(3);
        // 반지름이 3인 Circle 객체 c2를 생성
        Circle c2 = new Circle(3);

        // c1 객체의 toString() 메서드를 호출하여 문자열을 출력
        System.out.println("c1 :" + c1.toString());
        // c2 객체의 toString() 메서드를 호출하여 문자열을 출력
        System.out.println("c2 :" + c2);

        // c1과 c2 객체의 equals() 메서드를 호출하여 두 객체가 같은지 비교
        if (c1.equals(c2)){
            // 같으면 "c1과 c2는 같다." 출력
            System.out.println("c1과 c2는 같다.");
        } else {
            // 다르면 "c1과 c2는 다르다." 출력
            System.out.println("c1과 c2는 다르다.");
        }
    }
}

class Circle {
    private int radius; // 반지름을 나타내는 정수형 변수

    // 생성자: 새로운 Circle 객체를 초기화
    public Circle(int radius) {
        this.radius = radius; // 매개변수 radius를 필드 radius에 할당
    }

    // equals 메서드: 두 Circle 객체가 같은지를 비교
    @Override
    public boolean equals(Object obj) {
        // 전달된 객체를 Circle 타입으로 캐스팅
        Circle other = (Circle) obj;
        // 현재 객체의 radius와 전달된 객체 other의 radius를 비교
        if (radius != other.radius) {
            return false; // 반지름이 다르면 false 반환
        }
        return true; // 반지름이 같으면 true 반환
    }

    // toString 메서드: Circle 객체를 문자열로 표현
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]"; // 객체의 반지름을 포함한 문자열 반환
    }
}
