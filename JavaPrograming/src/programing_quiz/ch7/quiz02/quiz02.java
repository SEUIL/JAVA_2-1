package easyjava.programing_quiz.ch7.quiz02;

public class quiz02 {
    public static void main(String[] args) {

    }
}
interface Edible{
    void eat();
}
interface Sweetable{
    void sweet();
}
interface Delicious extends Edible,Sweetable{
    void eat();
    void sweet();
}