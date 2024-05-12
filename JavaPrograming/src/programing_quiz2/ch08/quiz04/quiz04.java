package easyjava.programing_quiz2.ch08.quiz04;

public class quiz04 {
    public static void main(String[] args) {
        System.out.println(new Dice().roll());
    }
}
class Dice{
    int roll(){
        return (int) (Math.random()*6) + 1;
    }
}