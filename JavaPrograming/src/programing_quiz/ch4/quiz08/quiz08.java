package easyjava.programing_quiz.ch4.quiz08;

public class quiz08 {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());

    }
}

class Dice{
    int face = 10;
    double roll(){
        while(true){
            double v = Math.random() * face;
            if (v >= 1.0 && v < 6.0){
                return (int) v;
            }
        }
    }
}
