package sec08;

public class DowncastDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Person p = s1;// 자식 -> 부모 : 업캐스팅

        Student s2 = (Student) p;


    }
}
