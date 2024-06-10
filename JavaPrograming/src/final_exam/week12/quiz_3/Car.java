package easyjava.final_exam.week12.quiz_3;

import java.util.Arrays;
import java.util.List;

public class Car {
    // Car 클래스의 private 필드
    private String model;     // 자동차 모델
    private boolean gasoline; // 휘발유 차량인지 여부 (true: 휘발유, false: 디젤)
    private int age;          // 자동차 나이 (연식)
    private int mileage;      // 주행 거리 (킬로미터)

    // Car 객체를 초기화하는 생성자
    public Car(String model, boolean gasoline, int age, int mileage) {
        this.model = model;
        this.gasoline = gasoline;
        this.age = age;
        this.mileage = mileage;
    }

    // 자동차 모델을 반환하는 메소드
    public String getModel() {
        return model;
    }

    // 휘발유 차량인지 여부를 반환하는 메소드
    public boolean isGasoline() {
        return gasoline;
    }

    // 자동차 나이를 반환하는 메소드
    public int getAge() {
        return age;
    }

    // 주행 거리를 반환하는 메소드
    public int getMileage() {
        return mileage;
    }

    // 자동차 정보를 문자열로 반환하는 메소드
    public String toString() {
        return String.format("Car(%s, %s, %d, %d)", model, gasoline, age, mileage);
    }

    // Car 객체 리스트를 초기화하는 static final 필드
    public static final List<Car> cars = Arrays.asList(
            new Car("소나타", true, 18, 210000),
            new Car("코란도", false, 15, 200000),
            new Car("그랜저", true, 12, 150000),
            new Car("싼타페", false, 10, 220000),
            new Car("아반테", true, 10, 70000),
            new Car("에쿠스", true, 6, 100000),
            new Car("그랜저", true, 5, 80000),
            new Car("소나타", true, 2, 35000),
            new Car("쏘렌토", false, 1, 10000),
            new Car("아반테", true, 1, 7000)
    );
}
