package easyjava.programing_quiz2.ch09.quiz04;

public class quiz04 {
    public static void main(String[] args) {
        Pair<Integer> p1 = new Pair<>(10,20);
        Pair<Double> p2 = new Pair<>(10.0,20.0);

        System.out.println(p1.first());
        System.out.println(p2.second());
    }
}
class Pair<Num>{
    Num x,y;
    public Pair(Num x, Num y){
        this.x = x;
        this.y = y;
    }
    public Num first(){
        return x;
    }
    public Num second(){
        return y;
    }
}