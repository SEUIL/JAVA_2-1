package easyjava.Quiz4_5_6;
import java.util.Scanner;

//너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라.
// 너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea()
// 메소드를 가진 Rectangle 클래스를 작성하고 활용하시오

class Rectangle{
    int width;
    int height;
    public int getArea(){
        return width*height;
    }
}

public class quiz4_1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        rectangle.width = scanner.nextInt();
        rectangle.height = scanner.nextInt();
        System.out.println("사각형의 면적은: " + rectangle.getArea());
        scanner.close();
    }
}


