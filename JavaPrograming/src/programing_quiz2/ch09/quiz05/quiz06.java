package easyjava.programing_quiz2.ch09.quiz05;

import java.util.ArrayList;
import java.util.List;

public class quiz06 {
    public static void main(String[] args) {
        List<Animal> lists = new ArrayList<>();
        lists.add(new Dog());
        lists.add(new Cuckoo());
        printSound(lists);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        printSound(dogs);
    }

    static void printSound(List<? extends Animal> lists) {
        for (Animal list : lists) {
            list.sound();
        }
    }
}

interface Animal {
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("멍멍~~");
    }
}

class Cuckoo implements Animal{
    @Override
    public void sound() {
        System.out.println("뻐꾹뻐꾹~~");
    }
}