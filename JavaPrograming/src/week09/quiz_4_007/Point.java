package easyjava.week09.quiz_4_007;

public class Point {
    private int x, y; // x와 y 좌표를 나타내는 정수형 변수

    // 생성자: 새로운 Point 객체를 초기화
    public Point(int x, int y) {
        this.x = x; // 매개변수 x를 필드 x에 할당
        this.y = y; // 매개변수 y를 필드 y에 할당
    }

    // equals 메서드: 두 Point 객체가 같은지를 비교
    public boolean equals(Object obj) {
        // 전달된 객체를 Point 타입으로 캐스팅
        Point p = (Point) obj;
        // 현재 객체의 x, y 좌표와 전달된 객체 p의 x, y 좌표를 비교
        if (x == p.x && y == p.y) {
            return true; // 좌표가 모두 같으면 true 반환
        } else {
            return false; // 좌표가 하나라도 다르면 false 반환
        }
    }
}
