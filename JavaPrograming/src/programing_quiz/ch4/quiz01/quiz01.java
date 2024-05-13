package easyjava.programing_quiz.ch4.quiz01;

public class quiz01 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.0,5.0);
        System.out.println(t.findArea());

    }
}

class Triangle{
    double base; //
    double height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    } // 삼각형의 밑변과 높이를 초기화하는 생성자
    double findArea(){
        return (base * height)/2;
    } // 삼각형의 넓이를 계산하여 반환하는 메소드
}