package easyjava.programing_quiz2.ch08.quiz02;

import java.text.MessageFormat;

public class quiz02 {
    public static void main(String[] args) {
        System.out.println(new Student("김삿갓"));
        System.out.println(new Student("홍길동"));
    }
}

class Student{
    String name;
    public Student(String name){
        this.name = name;
    }
    public String toString(){
        String s = MessageFormat.format("학생[{0}]", name);
        return s;
    }
}