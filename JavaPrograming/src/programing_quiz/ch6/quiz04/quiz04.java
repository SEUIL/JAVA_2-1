package easyjava.programing_quiz.ch6.quiz04;

public class quiz04 {
    public static void main(String[] args) {
        Parent p = new Child(); // p는 child 클래스의 객체로 초기화 됨
        // 하지만 parent클래스의 멤버변수와 메서드를 가리킴
        System.out.println(p.name);
        p.print();
    }
}

class Parent{
    String name = "영조";
    void print(){
        System.out.println(name);
    }
}

class Child extends Parent{
    String name = "나는 사도세자이다";
    void print(){
        System.out.println(name);
    }
}
