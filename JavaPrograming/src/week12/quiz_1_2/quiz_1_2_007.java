package easyjava.week12.quiz_1_2;

import java.util.Arrays;
import java.util.Comparator;

class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int findArea() {
        return width * height;
    }

    public String toString() {
        return String.format("사각형[폭=%d, 높이=%d]", width,
                height);
    }
}

public class quiz_1_2_007 {
    public static void main(String[] args) {
        Rectangle[] rectangles = {new Rectangle(3, 5),
                new Rectangle(2, 10), new Rectangle(5, 5)};
        Arrays.sort(rectangles,(first, second)->first.findArea() - second.findArea());
        System.out.println("넓이 비교");
        for (Rectangle r : rectangles)
            System.out.println(r);
        Arrays.sort(rectangles,(first, second)->first.findArea() - second.findArea());
            System.out.println("너비(width) 비교");
            for (Rectangle r : rectangles)
                    System.out.println(r.getWidth());
        }
    }


