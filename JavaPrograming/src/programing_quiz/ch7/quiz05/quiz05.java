package easyjava.programing_quiz.ch7.quiz05;

import easyjava.week07.quiz7_5.Controllable;

public class quiz05 {
    public static void main(String[] args) {
        Controller[] c = { new TV(false), new Radio(true)};

        for (Controller controller : c) {
            controller.show();
        }
    }
}
abstract class Controller {
    boolean power;
    public Controller(boolean power){
        this.power = power;
    }
    void show() {
        if (power==false) System.out.println(getName() + "가 꺼졌습니다.");
        else System.out.println(getName() + "가 켜졌습니다.");
    }
    abstract String getName();
}

class TV extends Controller{
    @Override
    String getName() {
        return "TV";
    }
    TV (boolean power) {
        super(power);
    }
}

class Radio extends Controller{
    @Override
    String getName() {
        return "라디오";
    }
    Radio(boolean power) {
        super(power);
    }
}


//interface Controller{
//    void show();
//    String getName();
//}
//
//class TV implements Controller{
//    boolean power;
//    TV(boolean power){
//        this.power=power;
//    }
//    @Override
//    public void show() {
//        System.out.println(getName() + "가 꺼졌습니다.");
//    }
//    @Override
//    public String getName() {
//        return "TV";
//    }
//}
//
//class Radio implements Controller{
//    boolean power;
//    Radio(boolean power){
//        this.power = power;
//    }
//    @Override
//    public void show() {
//        System.out.println(getName() + "가 켜졌습니다.");
//    }
//
//    @Override
//    public String getName() {
//        return "라디오";
//    }
//}