package easyjava.week10.quiz_4_2;

import easyjava.week10.quiz_4_2.generic.Cup;

public class GenericClass2Demo {
    public static void main(String[] args) {
        Cup<Beer> c = new Cup<Beer>();

        c.setBeverage(new Beer());
        Beer b1 = c.getBeverage();

//        c.setBeverage(new Boricha());
        b1 = c.getBeverage();
    }
}