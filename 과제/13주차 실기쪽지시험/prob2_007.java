package ws_2_ex2_007.exam2_007.ex2;

class Scholarstu<T,U>{
    private T math;
    private U english;
    public Scholarstu(){};
    public Scholarstu(T math, U english){
        this.math = math;
        this.english = english;
    };
    public T getMath(){
        return math;
    }
    public U getEnglish(){
        return english;
    }
}


public class prob2_007 {
    public static void main(String[] args) {
        Scholarstu<Integer,Integer> s1 = new Scholarstu<>(80,75);
        Scholarstu<Double,Double> s2 = new Scholarstu<>(85.5,90.5);
        System.out.println("정수 s1의 수학과 영어 : " + s1.getMath() + ", " + s1.getEnglish());
        System.out.println("실수 s2의 수학과 영어 : " + s2.getMath() + ", " + s2.getEnglish());
    }
}

