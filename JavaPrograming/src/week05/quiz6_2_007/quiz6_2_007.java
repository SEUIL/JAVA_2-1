package week05.quiz6_2_007;

//다음 표와 실행 결과를 참고해서 프로그램을 작성하시오. Show()메서드는 객체의 정보를 문자열로 반환한다.
// - Person, Person의 자식 Student, Student의 자식 ForeignStudent클래스를 작성하시오.
// - Person 타입 배열이 Person, Student, ForeignStudent 타입의 객체를 1개씩 포함하며, Person타입 배열
//원소를 for ~ each 문을 사용해 각 원소의 정보를 실행 결과와 같이 출력하는 프로그램을 작성하시오.

public class quiz6_2_007 {
    //2133007
    //황스일
    public static void main(String[] args) {
        Person[] person = { new Person("길동이",22), new Student("황진이",23,100),
                new ForeignStudent("Amy",30,200,"U.S.A") };

        for (Person s : person) {
            s.show();
        }
    }
}

class Person{
    protected String name;
    protected int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println("사람[이름: " + name + ", 나이: "+age+"]");
    }
}

class Student extends Person{

    protected int studentNumber;

    Student(String name,int age,int studentNumber){
        super(name,age);
        this.studentNumber = studentNumber;
    }

    void show(){
        System.out.println("학생[이름: " + name + ", 나이: "
                +age+ ", 학번: "+ studentNumber +"]");
    }
}

class ForeignStudent extends Student{
    protected String nationality;

    ForeignStudent(String name,int age,int studentNumber, String nationality){
        super(name,age,studentNumber);
        this.nationality = nationality;
    }

    void show(){
        System.out.println("외국학생[이름: " + name + ", 나이: "
                +age+ ", 학번: "+ studentNumber + ", 국적: "+ nationality +"]");
    }

}