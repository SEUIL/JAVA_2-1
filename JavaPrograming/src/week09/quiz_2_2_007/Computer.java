package easyjava.week09.quiz_2_2_007;

public class Computer implements Controllable {
    @Override //자식은 부모보다 접근지정자가 넓어야함!!
    public void turnOn() { //반드시 오버라이딩 구현
        System.out.println("컴퓨터를 켠다.");
    }
    @Override
    public void turnOff() { //반드시 오버라이딩 구현
        System.out.println("컴퓨터를 끈다.");
    }
}
