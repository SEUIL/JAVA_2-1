package easyjava.week06_test.prob2;

import java.util.Scanner;

class Triangle2{
    private double base;
    private double height;

    public Triangle2(){
        base = 0.0;
        height = 5.0;
    }
    public Triangle2(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double getBase(){
        return base;
    }
    public double setBase(double b){
        return new Triangle2().getBase();
    }
    double findArea(){
        return (base*height)/2 ;
    }

    boolean isSameArea(Triangle2 k){
        return this.findArea() == k.findArea();
    }
}

public class prob2_007_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle2[] triangle2s = new Triangle2[3];


        for (int i = 0; i<triangle2s.length; i++){
//            triangle2s[i] = scanner.nextDouble();
            System.out.println("밑변, 높이 값 입력: ");
        }

        System.out.println("밑변, 높이 값 입력: ");

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        Triangle2 t1 = new Triangle2();

        t1.setBase(base);

        Triangle2 t2 = new Triangle2(base, height);

        System.out.println("t1의 밑변 "+ t1.getBase());
        System.out.println("t2의 밑변 "+ t2.getBase());
        System.out.println("t1의 넓이 "+ t1.findArea());
        System.out.println("t1과 t2의 넓이 비교"+ t1.isSameArea(t2));

    }
}




