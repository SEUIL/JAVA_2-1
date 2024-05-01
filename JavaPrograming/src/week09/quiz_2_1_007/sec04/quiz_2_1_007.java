package easyjava.week09.quiz_2_1_007.sec04;

import easyjava.week09.quiz_2_1_007.Controllable;
import easyjava.week09.quiz_2_1_007.TV;
import easyjava.week09.quiz_2_1_007.Computer;
public class quiz_2_1_007 {
    public static void main(String[] args) {
        TV tv = new TV();
        Computer com = new Computer();
        tv.turnOn(); tv.turnOff(); tv.repair();
        com.turnOn(); com.turnOff(); com.repair();
        Controllable.reset();
        // tv.reset();
        // com.reset();
    }

}
