package easyjava.week07.quiz7_5_2;

public class TV implements Controllable {
    public void turnOn(){ //반드시 오버라이딩 구현
        System.out.println("TV를 켠다");
    }
    public void turnOff(){
        System.out.println("TV를 끈다.");
    }
}
