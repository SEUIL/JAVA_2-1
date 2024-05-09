package easyjava.week10.quiz_4_1;

import easyjava.week10.quiz_4_1.object.Cup;
public class GenericClass1Demo {
    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new sec03.Beer());
        sec03.Beer b1 = (sec03.Beer) c.getBeverage();

        c.setBeverage(new Boricha());
        //b1 = (Beer) c.getBeverage();
    }
}