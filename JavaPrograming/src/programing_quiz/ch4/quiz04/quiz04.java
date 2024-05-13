package easyjava.programing_quiz.ch4.quiz04;

public class quiz04 {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.println("자동차 수 : " + Car.getNumOfCar() +
                " 빨간색 자동차 수 : "+Car.getNumOfRedCar());
    }
}
// 자동차를 나타내는 클래스
class Car {
    static String color; // 자동차의 색상을 나타내는 정적 변수
    static int numOfCar; // 생성된 자동차의 총 수를 나타내는 정적 변수
    static int numOfRedCar; // 빨간색 자동차의 수를 나타내는 정적 변수

    // 생성자: 자동차 객체가 생성될 때마다 호출되며, 자동차의 색상에 따라 빨간색 자동차의 수를 증가시킴
    Car(String color) {
        numOfCar++; // 생성된 자동차의 총 수 증가
        if (color.equals("red") || color.equals("RED")) { // 입력된 색상이 빨간색인 경우
            numOfRedCar++; // 빨간색 자동차의 수 증가
        }
    }

    // 생성된 자동차의 총 수를 반환하는 정적 메서드
    static int getNumOfCar(){
        return numOfCar;
    }

    // 생성된 빨간색 자동차의 수를 반환하는 정적 메서드
    static int getNumOfRedCar(){
        return numOfRedCar;
    }
}

