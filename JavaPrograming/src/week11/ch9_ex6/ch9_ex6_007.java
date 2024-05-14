package easyjava.week11.ch9_ex6;

public class ch9_ex6_007 {
    public static void main(String[] args) {
        Max<Number> n = new Max<>();
        System.out.println(n.maximum(10.0, 8.0));
        System.out.println(n.maximum(5, 8.0));
        Max<String> s = new Max<>();
        System.out.println(s.maximum("Hello", "Hi"));
        System.out.println(s.maximum("Good", "morning"));
    }
}

class Max<T> {
    private String str1, str2;
    private double num1, num2;

    public T maximum(T val1, T val2) {
        if (val1 instanceof Number) {
            num1 = ((Number) val1).doubleValue();
            num2 = ((Number) val2).doubleValue();
            return (num1 > num2) ? val1 : val2;
        } else {
            str1 = (String) val1;
            str2 = (String) val2;
            return (str1.length() > str2.length()) ? val1 : val2;
        }
    }
}
