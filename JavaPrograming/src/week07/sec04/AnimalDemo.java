package easyjava.week07.sec04;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d = new Dog(); //타입변환 : Dog 클래스의 객체를 생성하고, 이를 Dog 타입의 변수 d에 할당
        Cuckoo c = new Cuckoo();

        makeSound(d);// 다형성 : Dog 객체 d를 인자로 전달하여 makeSound 메소드를 호출합니다.
        // 이때, makeSound 메소드는 Animal 인터페이스를 매개변수로 받습니다.
        // Dog 클래스는 Animal 인터페이스를 구현했으므로 Dog 객체도 Animal 타입으로 변환될 수 있습니다.
        makeSound(c);
    }
    static void makeSound(Animal a){
        //여기서 Animal a로 Animal 인터페이스를 매개변수로 받지 않고
        // Dog a 로 Dog 매개변수를 받을 경우 makeSound(c);에서 오류 발생,
        // 이유는 c 는 Cuckoo 클래스의 객체를 생성했기 때문
        a.sound();
    }
}
interface Animal{
    void sound();
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("멍멍~");
    }
}
class Cuckoo implements Animal{
    @Override
    public void sound() {
        System.out.println("뻐꾹~");
    }
}
