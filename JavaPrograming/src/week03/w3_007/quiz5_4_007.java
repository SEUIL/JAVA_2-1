package week03.w3_007;

import java.util.Scanner;

//2133007
//황스일
class Circle {
    private double x;
    private double y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("Circle 정보 - 중심 좌표 (" + x + ", " + y + "), 반지름: " + radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class quiz5_4_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle[] circles = new Circle[3];

        // Circle 객체 생성 및 입력
        for (int i = 0; i < circles.length; i++) {
            System.out.print("x, y, radius 입력 >> ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            circles[i] = new Circle(x, y, radius);
        }

        // Circle 객체 출력
        System.out.println("생성된 Circle 객체 정보:");
        for (Circle circle : circles) {
            circle.show();
        }

        // Circle 객체 배열의 면적 계산 및 출력
        double maxArea = 0.0;
        Circle maxAreaCircle = null;

        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("원의 면적: " + area);
            if (area > maxArea) {
                maxArea = area;
                maxAreaCircle = circle;
            }
        }

        // 면적이 가장 큰 원 출력
        System.out.println("면적이 가장 큰 원:");
        maxAreaCircle.show();
    }
}

