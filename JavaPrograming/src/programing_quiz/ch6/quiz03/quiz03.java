package easyjava.programing_quiz.ch6.quiz03;

public class quiz03 {
    public static void main(String[] args) {
        Point t = new Point(3, 4);
        Point t2 = new MovablePoint(4, 5, 10, 12);
        System.out.println(t.toString());
        System.out.println(t2.toString());
    }
}

class Point{
    private int x,y;
    int getPointX(){
        return x;
    }
    int getPointY(){
        return y;
    }
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x 좌표 : " + x + ", y 자표 : " + y + "\n";
    }
}

class MovablePoint extends Point{
    private int xSpeed,ySpeed;
    MovablePoint(int x, int y,int xSpeed,int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "x 좌표 : " + getPointX() + ", y 자표 : " + getPointY() +
                ", x 이동속도 : " + xSpeed + ", y 이동속도 : "+ySpeed;
    }
}