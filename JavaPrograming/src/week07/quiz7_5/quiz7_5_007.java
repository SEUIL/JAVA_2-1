package easyjava.week07.quiz7_5;

public class quiz7_5_007 {
    public static void main(String[] args) {
        TV tv = new TV();
        Computer com = new Computer();
        tv.turnOn();
        tv.turnOff();
        tv.repair();
        com.turnOn();
        com.turnOff();
        com.repair();
        Controllable.reset();
        // tv.reset();
        // com.reset();
    }
}
