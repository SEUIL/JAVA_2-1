package easyjava.programing_quiz2.ch08.quiz01;

import java.util.Objects;

public class quiz01 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);

        if (c1.equals(c2)) {
            System.out.println("c1과 c2는 같다.");
        } else {
            System.out.println("c1과 c2는 다르다");
        }
    }
}
class Circle{
    int num;
    public Circle(int num){
        this.num = num;
    }
    public int hashCode(){
        return Objects.hash(num);
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Circle)){
            return false;
        }
        Circle configation = (Circle)obj;
        return num == configation.num;
    }
}