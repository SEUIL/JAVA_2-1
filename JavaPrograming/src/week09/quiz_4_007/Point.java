package easyjava.week09.quiz_4_007;

public class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj) {
        Point p = (Point) obj;
        if (x == p.x && y == p.y){
            return true;
        }
        else {
            return false;
        }
    }
}
