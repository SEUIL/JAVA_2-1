package easyjava.week05.quiz6_2_007;

// Person 클래스: 기본 클래스
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String show() {
        return String.format("사람[이름: %s, 나이: %d]", name, age);
    }
}

// Student 클래스: Person 클래스를 상속하는 자식 클래스
class Student extends Person {
    protected String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public String show() {
        return String.format("학생[이름: %s, 나이: %d, 학번: %s]", name, age, studentId);
    }
}

// ForeignStudent 클래스: Student 클래스를 상속하는 자식 클래스
class ForeignStudent extends Student {
    private String country;

    public ForeignStudent(String name, int age, String studentId, String country) {
        super(name, age, studentId);
        this.country = country;
    }

    @Override
    public String show() {
        return String.format("외국학생[이름: %s, 나이: %d, 학번: %s, 국적: %s]", name, age, studentId, country);
    }
}

// Main 클래스
public class quiz6_2_111 {
    public static void main(String[] args) {
        // Person 타입 배열 생성
        Person[] people = new Person[3];

        // 배열에 객체 할당
        people[0] = new Person("길동이", 22);
        people[1] = new Student("황진이", 23, "100");
        people[2] = new ForeignStudent("Amy", 30, "200", "U.S.A");

        // for-each 문을 사용하여 각 원소의 정보 출력
        for (Person person : people) {
            System.out.println(person.show());
        }
    }
}
