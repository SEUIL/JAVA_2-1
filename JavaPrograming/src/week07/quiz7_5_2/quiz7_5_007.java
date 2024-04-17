package easyjava.week07.quiz7_5_2;

public class quiz7_5_007 {
    public static void main(String[] args) {
        Controllable[] controllable = {new TV(), new Computer()};
        for (Controllable c : controllable) {
            c.turnOn();
            c.turnOff();
            c.repair();
        }
    }
}
