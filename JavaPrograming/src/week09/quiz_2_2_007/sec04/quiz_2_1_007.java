package easyjava.week09.quiz_2_2_007.sec04;

import easyjava.week09.quiz_2_2_007.Computer;
import easyjava.week09.quiz_2_2_007.Controllable;
import easyjava.week09.quiz_2_2_007.TV;


public class quiz_2_1_007 {
    public static void main(String[] args) {
        Controllable[] controllable = { new TV(), new Computer() };
        for (Controllable c : controllable) {
            c.turnOn();
            c.turnOff();
            c.repair();
        }
        Controllable.reset();
    }

}
