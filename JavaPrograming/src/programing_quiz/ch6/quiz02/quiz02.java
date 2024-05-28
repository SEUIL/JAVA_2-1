package easyjava.programing_quiz.ch6.quiz02;

// Person 클래스 정의
class Person {
    String name; // 이름
    int age; // 나이

    // Person 클래스의 정보를 문자열로 반환하는 메서드
    String show() {
        return "사람[이름 : " + name + ", 나이 : " + age + "]";
    }

    // 이름을 반환하는 메서드
    String getPersonName() {
        return name;
    }

    // 나이를 반환하는 메서드
    int getPersonage() {
        return age;
    }

    // Person 클래스의 생성자
    public Person(String name, int age) {
        this.name = name; // 이름 초기화
        this.age = age; // 나이 초기화
    }
}

// Student 클래스 정의 (Person 클래스를 상속받음)
class Student extends Person {
    int number; // 학번

    // Student 클래스의 생성자
    public Student(String name, int age, int number) {
        super(name, age); // 부모 클래스의 생성자 호출하여 이름과 나이 초기화
        this.number = number; // 학번 초기화
    }

    // 학생 정보를 문자열로 반환하는 메서드 (오버라이딩)
    String show() {
        return ("학생[이름 : " + name + ", 나이 : " + age + ", " + "학번 : " + number + "]");
    }

    // 학번을 반환하는 메서드
    int getStudentNumber() {
        return number;
    }
}

// ForeignStudent 클래스 정의 (Student 클래스를 상속받음)
class ForeignStudent extends Student {
    String kook; // 국적

    // ForeignStudent 클래스의 생성자
    public ForeignStudent(String name, int age, int number, String kook) {
        super(name, age, number); // 부모 클래스의 생성자 호출하여 이름, 나이, 학번 초기화
        this.kook = kook; // 국적 초기화
    }

    // 외국 학생 정보를 문자열로 반환하는 메서드 (오버라이딩)
    String show() {
        return "외국학생[이름 : " + name + ", 나이 : " + age + ", " + "학번 : " + number + ", " + "국적 : " + kook + "]";
    }

    // 국적을 반환하는 메서드
    String getForeignStudent() {
        return kook;
    }
}

// 테스트 클래스
public class quiz02 {
    public static void main(String[] args) {
        // Person 배열 생성 및 초기화
        Person[] p = { new Person("길동이", 22), new Student("황진이", 23, 100), new ForeignStudent("AMY", 30, 200, "UㆍSㆍA") };

        // 배열의 각 요소를 순회하면서 정보 출력
        for (Person i : p) {
            System.out.println(i.show());
        }
    }
}
