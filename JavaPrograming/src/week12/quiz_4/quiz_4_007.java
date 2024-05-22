package easyjava.week12.quiz_4;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class quiz_4_007 {
    public static void main(String[] args) {
        IntPredicate even = x -> x % 2 == 0;
        System.out.println(even.test(3) ? "짝수" : "홀수");

        IntPredicate one = x -> x == 1;
        IntPredicate oneOrEven = one.or(even);
        System.out.println(oneOrEven.test(1) ?
                "1 혹은 짝수" : "1이 아닌 홀수");

        Predicate<String> p = Predicate.isEqual("Java Lambda");
        System.out.println(p.test("Java Lambda"));
        System.out.println(p.test("JavaFX"));

        BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
        System.out.println(bp.test(2, 3));
    }
}
