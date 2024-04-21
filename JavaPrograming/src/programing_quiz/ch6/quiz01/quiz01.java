package easyjava.programing_quiz.ch6.quiz01;

public class quiz01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        ColoredCircle coloredCircle = new ColoredCircle("빨간색", 10);
        circle.show();
        coloredCircle.show();
    }
}

class Circle{
    protected int radius;

    Circle(int radius) {
        this.radius = radius;
    }
    void show(){
        System.out.println("반지름이 " + radius + "인 원이다.");
    }
}

class ColoredCircle extends Circle{
    protected String color;
    ColoredCircle(String color,int radius) {
        super(radius);
        this.color = color;
    }

    @Override
    void show() {
        System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
    }
}
