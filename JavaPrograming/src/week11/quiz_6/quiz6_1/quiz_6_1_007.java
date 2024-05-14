package easyjava.week11.quiz_6.quiz6_1;

interface Negative {
    int neg(int x);
}

interface Printable {
    void print();
}

public class quiz_6_1_007 {
    public static void main(String[] args) {
        Negative n;
        n = (int x) -> { return -x; };

        System.out.println(n.neg(10));

        Printable p;
        p = () -> System.out.println("안녕!");

        p.print();
    }
}