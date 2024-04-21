package easyjava.programing_quiz.ch4.quiz02;

public class quiz02 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0,5.0);
        Triangle t2 = new Triangle(5.0,10.0);
        Triangle t3 = new Triangle(8.0,8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));

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
    boolean isSameArea(Triangle k){
        return this.findArea() == k.findArea();
    }
}