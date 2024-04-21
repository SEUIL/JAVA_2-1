package easyjava.programing_quiz.ch4.quiz01;

public class quiz01 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.0,5.0);
        System.out.println(t.findArea());

    }
}

class Triangle{
    double base;
    double height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    double findArea(){
        return (base * height)/2;
    }
}