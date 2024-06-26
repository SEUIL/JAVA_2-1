package easyjava.Quiz4_5_6;

public class quiz6_2 {
    public static void main(String[] args) {
        Person[] person = {new Person("길동이",22),
                new Student("황진이",23,100),
                new ForeignStudent("Amy",30,200,"U.S.A")};
        for (Person s : person) {
            s.show();
        }
    }
}

class Person{
    protected String name;
    protected int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void show(){
        System.out.println("사람[이름: "+name+", 나이: "+age+"]");
    }
}

class Student extends Person{
    protected int studentNumber;
    Student(String name, int age, int studentNumber){
        super(name,age);
        this.studentNumber = studentNumber;
    }
    void show(){
        System.out.println("사람[이름: "+name+", 나이: "+age+", 학번: "+studentNumber+"]");
    }
}

class ForeignStudent extends Student{
    protected String nationality;
    ForeignStudent(String name, int age, int studentNumber,String nationality) {
        super(name, age, studentNumber);
        this.nationality = nationality;
    }
    void show() {
        System.out.println("사람[이름: "+name+", 나이: "+age+", 학번: "+
                studentNumber+", 국적: "+nationality+ "]");
    }
}