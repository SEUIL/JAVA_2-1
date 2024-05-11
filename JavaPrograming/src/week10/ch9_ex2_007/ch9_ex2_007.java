package easyjava.week10.ch9_ex2_007;

public class ch9_ex2_007 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        try {
            casting(r);
        }
        catch (ClassCastException d) {
            d.printStackTrace();
            System.out.println("잘못된 형변환입니다.");
        }
    }

    static void casting(Shape s) throws ClassCastException{
        Circle c = (Circle) s;
    }
}
class Shape {}
class Rectangle extends Shape{}
class Circle extends Shape{}
