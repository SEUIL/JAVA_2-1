package easyjava.programing_quiz2.ch09.quiz06;

public class quiz06 {
    public static void main(String[] args) {
        // Max 클래스의 인스턴스 생성, Number 타입을 사용하는 제네릭 클래스
        Max<Number> n = new Max<>();
        // 두 개의 double 값을 비교하여 더 큰 값을 출력
        System.out.println(n.max(10.0, 8.0)); // 출력: 10.0
        // 하나는 int, 하나는 double 값을 비교하여 더 큰 값을 출력
        System.out.println(n.max(5, 8.0)); // 출력: 8.0

        // Max 클래스의 인스턴스 생성, String 타입을 사용하는 제네릭 클래스
        Max<String> s = new Max<>();
        // 두 개의 문자열을 비교하여 길이가 더 긴 문자열을 출력
        System.out.println(s.max("Hello", "Hi")); // 출력: Hello
        // 두 개의 문자열을 비교하여 길이가 더 긴 문자열을 출력
        System.out.println(s.max("Good", "moring")); // 출력: moring
    }
}

// 제네릭 클래스 Max 정의, Object 타입의 제네릭 사용
class Max<Object> {
    String str1, str2;
    double num1, num2;

    // max 메서드 정의, Object 타입의 두 매개변수 받아 비교
    public Object max(Object numStr1, Object numStr2) {
        // 첫 번째 매개변수가 Number 타입인지 확인
        if (numStr1 instanceof Number) {
            // Number 타입으로 변환 후 doubleValue()를 통해 double 값으로 변환
            num1 = ((Number) numStr1).doubleValue();
            num2 = ((Number) numStr2).doubleValue();
            // 두 숫자를 비교하여 더 큰 값을 반환
            return (num1 > num2) ? numStr1 : numStr2;
        } else {
            // 두 번째 매개변수가 문자열일 경우, 문자열로 변환
            str1 = (String) numStr1;
            str2 = (String) numStr2;
            // 두 문자열의 길이를 비교하여 더 긴 문자열을 반환
            return (str1.length() > str2.length()) ? numStr1 : numStr2;
        }
    }
}
