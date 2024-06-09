//class Pair<T >{
//    private T v1,v2;
//    public Pair(T v1,T v2){
//        this.v1 = v1;
//        this.v2 = v2;
//    }
//    public T first(){
//        return v1;
//    }
//    public T second(){
//        return v2;
//    }
//}
//public class quiz_5_007 {
//    public static void main(String[] args) {
//        Pair<Integer> p1 = new Pair<>(10, 20);
//        Pair<Double> p2 = new Pair<>(10.0, 20.0);
//        System.out.println(p1.first());
//        System.out.println(p2.second());
//    }
//}

package easyjava.final_exam.week10.quiz_5;

// 제네릭 클래스를 정의
class Pair<T, U> {
    private T v1; // 첫 번째 값을 저장할 변수
    private U v2; // 두 번째 값을 저장할 변수

    // 생성자: 두 값을 받아서 초기화
    public Pair(T v1, U v2) {
        this.v1 = v1; // 첫 번째 값을 초기화
        this.v2 = v2; // 두 번째 값을 초기화
    }

    // 첫 번째 값을 반환하는 메서드
    public T first() {
        return v1;
    }

    // 두 번째 값을 반환하는 메서드
    public U second() {
        return v2;
    }
}

// main 메서드를 포함한 클래스 정의
public class quiz_5_007 {
    public static void main(String[] args) {
        // 정수 타입의 Pair 객체를 생성
        Pair<Integer, Integer> p1 = new Pair<>(10, 20);
        // 실수 타입의 Pair 객체를 생성
        Pair<Double, Double> p2 = new Pair<>(10.0, 20.0);

        // p1 객체의 첫 번째 값을 출력
        System.out.println(p1.first());
        System.out.println(p1.second());

        // p2 객체의 두 번째 값을 출력
        System.out.println(p2.first());
        System.out.println(p2.second());
    }
}

//E - Element (컬렉션에서 사용되는 요소를 나타낼 때 주로 사용)
//K - Key (맵에서 키를 나타낼 때 주로 사용)
//N - Number (숫자를 나타낼 때 주로 사용)
//T - Type (일반적인 타입을 나타낼 때 주로 사용)
//V - Value (맵에서 값을 나타낼 때 주로 사용)
//S, U, V 등 - 두 번째, 세 번째, 네 번째 타입을 나타낼 때 사용