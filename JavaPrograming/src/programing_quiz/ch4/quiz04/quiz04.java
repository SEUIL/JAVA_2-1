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
class Car {
    static String color;
    static int numOfCar;
    static int numOfRedCar;
    Car(String color) {
        numOfCar++;
        if (color.equals("red") || color.equals("RED")) {
            numOfRedCar++;
        }
    }
    static int getNumOfCar(){
        return numOfCar;
    }
    static int getNumOfRedCar(){
        return numOfRedCar;
    }
}
