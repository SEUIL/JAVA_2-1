package week02.w2_007;
import java.util.Scanner;

class Rectangle {
    //2133007
    //황스일
        int width = 0;
        int height = 0;

        public int getArea() {
            int area = width * height;
            return area;
        }
    }

public class quiz4_1_007_week02 {
    public static void main(String[] args) {
            Rectangle rect = new Rectangle();
            Scanner scanner = new Scanner(System.in);
            System.out.print("사각형의 가로 및 세로 순서대로 입력 >> ");
            rect.width = scanner.nextInt();
            rect.height = scanner.nextInt();
            System.out.println("사각형의 면적은 " + rect.getArea());
            scanner.close();
    }
}
