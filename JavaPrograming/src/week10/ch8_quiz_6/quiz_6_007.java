package easyjava.week10.ch8_quiz_6;

public class quiz_6_007 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);
        System.out.println("c1 :" + c1.toString());
        System.out.println("c2 :" + c2);
        if (c1.equals(c2)){
            System.out.println("c1과 c2는 같다.");
        } else {
            System.out.println("c1과 c2는 다르다.");
        }
    }
}

class Circle{
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public boolean equals(Object obj) {
        Circle other = (Circle) obj;
        if (radius != other.radius){
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}