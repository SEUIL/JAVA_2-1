package week02.w2_007;

class Triangle{
    //2133007
    //황스일
    private double base;
    private double height;
    public Triangle(){
        base = 10.0;
        height = 5.0;
    }
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double findArea(){
        double area = (base * height) / 2;
        return area;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public boolean isSameArea(Triangle k){
        if (k.findArea() == findArea()){
            return true;
        }else {
            return false;
        }
    }
}
public class quiz4_3_007_week02 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);
        System.out.println("t1의 밑변 " + t1.getBase());
        System.out.println("t1의 높이 " + t1.getHeight());
        System.out.println("t1의 넓이 " + t1.findArea());
        System.out.println("t1과 t2의 넓이 비교 " + t1.isSameArea(t2));
        System.out.println("t1과 t3의 넓이 비교 " + t1.isSameArea(t3));
    }
}
