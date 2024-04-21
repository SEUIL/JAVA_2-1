package easyjava.programing_quiz.ch7.quiz01;

public class quiz01 {
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }
}
abstract class Abstract{
    int i;
    Abstract(int i){
        this.i = i;
    }
    void show(){
        System.out.println("i = "+i);
    };
}

class Concrete extends Abstract{
    int j;
    Concrete(int i,int j){
        super(i);
        this.j = j;
    }
    void show(){
        System.out.println("i = "+i+", j = "+j);
    }
}