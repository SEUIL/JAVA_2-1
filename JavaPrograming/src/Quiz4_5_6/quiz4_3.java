package easyjava.Quiz4_5_6;

//삼각형을 나타내는 Triangle 클래스를 작성하시오.
// - 삼각형의 속성으로는 실수값의 밑변(base)와 높이(height)을 동일 클래스에서만 접근하도록(캡슐화) 하고
// - 이 속성(필드)을 접근할 수 있는 접근자와 생성자도 정의하고 넓이를 구하는 메서드(findArea())도 정의하고
// - 또한 2개의 삼각형 넓이가 동일한지 비교하는 isSameArea( ) 메서드도 정의하시오

public class quiz4_3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);
        System.out.println("t1의 밑변 " + t1.getBase());
        System.out.println("t1의 높이 " + t1.getHeight());
        System.out.println("t1의 넓이 " + t1.findArea());
        System.out.println("t1과 t2의 넓이 비교 " + t1.isSameArea(t2));
        System.out.println("t1과 t3의 넓이 비교 " + t1.isSameArea(t3));
    }
}

class Triangle{
    private double base;
    private double height;
    public Triangle(){
        base = 10;
        height = 5;
    }
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    double findArea(){
        return (base*height)/2 ;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    boolean isSameArea(Triangle k){
        return this.findArea() == k.findArea();
    }
}