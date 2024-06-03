package easyjava.programing_quiz2.ch08.quiz02;

import java.text.MessageFormat;

public class quiz02 {
    public static void main(String[] args) {
        // 학생 객체 생성 및 출력
        System.out.println(new Student("김삿갓")); // 이름이 "김삿갓"인 학생 객체 생성 및 출력
        System.out.println(new Student("홍길동")); // 이름이 "홍길동"인 학생 객체 생성 및 출력
    }
}

// Student 클래스 정의
class Student {
    String name; // 이름을 저장하는 변수

    // Student 클래스 생성자
    public Student(String name) {
        this.name = name; // 이름 초기화
    }

    // toString() 메서드 오버라이딩
    public String toString() {
        // MessageFormat을 사용하여 형식화된 문자열 생성
        String s = MessageFormat.format("학생[{0}]", name);
        return s; // 생성된 문자열 반환
    }
}
