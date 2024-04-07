package easyjava.Quiz4_5_6;
import java.util.Scanner;

//다음 실행 결과와 같이 3개의 Circle 객체 배열를 만들고 x, y, radius 값을 읽어 3개의
// Circle 객체를 만들고show()를 이용하여 이들을 모두 출력하고 getArea() 를 이용해 3개의
// 객체 배열의 면적을 구하여 출력하고그 중 면적이 가장 큰 원을 출력하시오.
// - Circle 클래스 멤버의 필드 x, y, radius는 private로 하고, 생성자는 각 필드를 입력
// 받아 각 필드에 초기화함.
// - Circle 클래스 멤버의 메서드는 show()로 각 필드 값을 출력하고, getArea()로 원의
// 면적을 구하시오.

class Circle{
    private double x;
    private double y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
public class quiz5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];
        for (int i=0; i<c.length; i++){
            System.out.println("x,y,radius : ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x,y,radius);
        }
        for (int i=0; i<c.length; i++){
            c[i].show();
        }

        double maxArea = 0;
        for (int i=0; i<c.length; i++){
            System.out.println(c[i].getArea());
            if (c[i].getArea()>maxArea){
                maxArea = c[i].getArea();
            }
        }
        System.out.println("가장 큰 원: "+maxArea);

    }
}
