package easyjava.final_exam.week12.quiz_1.quiz_1_1;

import java.util.Arrays;
import java.util.Comparator;
//Comparator 인터페이스과 익명 구현 객체
// 사각형을 나타내는 Rectangle 클래스
class Rectangle {
    private int width, height; // 사각형의 폭과 높이를 저장하는 변수

    // Rectangle 클래스의 생성자
    public Rectangle(int width, int height) {
        this.width = width; // 폭 초기화
        this.height = height; // 높이 초기화
    }

    // 사각형의 폭을 반환하는 메서드
    public int getWidth() {
        return width;
    }

    // 사각형의 면적을 계산하여 반환하는 메서드
    public int findArea() {
        return width * height;
    }

    // 사각형의 정보를 문자열로 반환하는 메서드
    public String toString() {
        return String.format("사각형[폭=%d, 높이=%d]", width, height);
    }
}

// 메인 클래스를 정의하는 quiz_1_1_007 클래스
public class quiz_1_1_007 {
    public static void main(String[] args) {
        // Rectangle 객체 배열을 생성 및 초기화
        Rectangle[] rectangles = {
                new Rectangle(3, 5),
                new Rectangle(2, 10),
                new Rectangle(5, 5)
        };

        // 면적을 기준으로 Rectangle 배열을 정렬
        Arrays.sort(rectangles, new Comparator<Rectangle>() {
            // Comparator 인터페이스를 익명 클래스 형태로 구현하여 면적 비교 로직 제공
            public int compare(Rectangle first, Rectangle second) {
                return first.findArea() - second.findArea(); // 면적 비교
            }
        });

        // 정렬된 사각형의 정보를 출력
        System.out.println("넓이 비교");
        for (Rectangle r : rectangles)
            System.out.println(r);

        // 너비를 기준으로 Rectangle 배열을 정렬
        Arrays.sort(rectangles, new Comparator<Rectangle>() {
            public int compare(Rectangle first, Rectangle second) {
                return first.getWidth() - second.getWidth(); // 너비 비교
            }
        });

        // 정렬된 사각형의 너비를 출력
        System.out.println("너비(width) 비교");
        for (Rectangle r : rectangles)
            System.out.println(r.getWidth());
    }
}
