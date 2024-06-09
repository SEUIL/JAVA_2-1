package easyjava.final_exam.week12.quiz_1.quiz_1_2;

import java.util.Arrays;

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

public class quiz_1_2_007 {
    public static void main(String[] args) {
        // Rectangle 객체 배열을 생성 및 초기화
        Rectangle[] rectangles = {
                new Rectangle(3, 5),
                new Rectangle(2, 10),
                new Rectangle(5, 5)
        };

        // 면적을 기준으로 Rectangle 배열을 정렬 (람다 표현식 사용)
        Arrays.sort(rectangles, (first, second) -> first.findArea() - second.findArea());

        // 정렬된 사각형의 정보를 출력
        System.out.println("넓이 비교");
        for (Rectangle r : rectangles) {
            System.out.println(r);
        }

        // 너비를 기준으로 Rectangle 배열을 정렬 (잘못된 정렬 기준을 수정)
        Arrays.sort(rectangles, (first, second) -> first.getWidth() - second.getWidth());

        // 정렬된 사각형의 너비를 출력
        System.out.println("너비(width) 비교");
        for (Rectangle r : rectangles) {
            System.out.println(r.getWidth());
        }
    }
}
