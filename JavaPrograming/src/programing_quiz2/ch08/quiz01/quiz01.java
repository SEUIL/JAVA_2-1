package easyjava.programing_quiz2.ch08.quiz01;

import java.util.Objects;

public class quiz01 {
    public static void main(String[] args) {
        // 두 개의 Circle 객체 생성
        Circle c1 = new Circle(3); // 반지름이 3인 Circle 객체 생성
        Circle c2 = new Circle(3); // 반지름이 3인 Circle 객체 생성

        // 두 Circle 객체가 같은지 여부를 판별하여 출력
        if (c1.equals(c2)) {
            System.out.println("c1과 c2는 같다.");
        } else {
            System.out.println("c1과 c2는 다르다");
        }

    }
}

// Circle 클래스 정의
class Circle {
    int num; // 반지름을 저장하는 변수

    // Circle 클래스 생성자
    public Circle(int num) {
        this.num = num; // 반지름 초기화
    }

    // hashCode() 메서드 오버라이딩
    public int hashCode() {
        return Objects.hash(num); // num 변수를 기반으로 한 해시코드 생성
    }

    // equals() 메서드 오버라이딩
    public boolean equals(Object obj) {
        if (this == obj) { // 객체 자신과 비교했을 때 같은 객체인지 확인
            return true;
        }
        if (!(obj instanceof Circle)) { // 비교 대상이 Circle 객체인지 확인
            return false;
        }
        Circle configation = (Circle) obj; // 비교 대상을 Circle 객체로 캐스팅
        return num == configation.num; // 반지름이 같은지 여부 반환
    }
}
