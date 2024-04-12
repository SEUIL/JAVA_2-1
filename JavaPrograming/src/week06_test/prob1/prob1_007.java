package easyjava.week06_test.prob1;

import java.util.Scanner;

class Triangle{
    private double base;
    private double height;

    public Triangle(){
        base = 0.0;
        height = 5.0;
    }
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double getBase(){
        return base;
    }
    public void setBase(double b){
//        return new Triangle(b,5.0).getBase();
        this.base = b;
    }
    double findArea(){
        return (base*height)/2 ;
    }

    boolean isSameArea(Triangle k){
        return this.findArea() == k.findArea();
    }
}

public class prob1_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("밑변, 높이 값 입력: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Triangle t1 = new Triangle();
        t1.setBase(base);
        Triangle t2 = new Triangle(base, height);
        System.out.println("t1의 밑변 "+ t1.getBase());
        System.out.println("t2의 밑변 "+ t2.getBase());
        System.out.println("t1의 넓이 "+ t1.findArea());
        System.out.println("t1과 t2의 넓이 비교"+ t1.isSameArea(t2));

    }
}




