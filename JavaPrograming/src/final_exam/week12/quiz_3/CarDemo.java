package easyjava.final_exam.week12.quiz_3;

import java.util.ArrayList;
import java.util.List;

// CarConsumer 인터페이스: Car 객체를 받아 처리하는 메소드 정의
interface CarConsumer {
    void apply(Car car);
}

// CarPredicate 인터페이스: Car 객체를 테스트하는 메소드 정의
interface CarPredicate {
    boolean test(Car car);
}

public class CarDemo {
    public static void main(String[] args) {
        // 디젤 자동차 목록 찾기
        List<Car> dieselCars = findCars(Car.cars, c -> !c.isGasoline());
        System.out.println("디젤 자동차 = " + dieselCars);

        // 오래된 자동차 목록 찾기 (10년 이상)
        List<Car> oldCars = findCars(Car.cars, c -> c.getAge() > 10);
        System.out.println("오래된 자동차 = " + oldCars);

        // 오래된 디젤 자동차 목록 찾기 (10년 이상이고 디젤인 경우)
        List<Car> oldDieselCars = findCars(Car.cars, c -> c.getAge() > 10 && !c.isGasoline());
        System.out.println("오래된 디젤 자동차 = " + oldDieselCars);

        // 디젤 자동차 목록 출력
        System.out.print("디젤 자동차 = ");
        printCars(dieselCars, c -> System.out.printf("%s(%d) ", c.getModel(), c.getAge()));

        // 오래된 자동차 목록 출력
        System.out.print("\n오래된 자동차 = ");
        printCars(oldCars, c -> System.out.printf("%s(%d, %d) ", c.getModel(), c.getAge(), c.getMileage()));
    }

    // 주어진 조건에 맞는 자동차 목록 찾기
    public static List<Car> findCars(List<Car> all, CarPredicate cp) {
        List<Car> result = new ArrayList<>();

        // 모든 자동차를 순회하면서 조건에 맞는 자동차를 결과 리스트에 추가
        for (Car car : all) {
            if (cp.test(car))
                result.add(car);
        }
        return result;
    }

    // 주어진 소비자 조건에 따라 자동차 목록 출력
    public static void printCars(List<Car> all, CarConsumer cc) {
        // 모든 자동차를 순회하면서 소비자 조건에 따라 처리
        for (Car car : all) {
            cc.apply(car);
        }
    }
}
