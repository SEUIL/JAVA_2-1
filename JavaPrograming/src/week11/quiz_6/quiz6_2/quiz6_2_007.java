package easyjava.week11.quiz_6.quiz6_2;
//익명 지역클래스
interface Negative {
    int neg(int x);
}
interface Printable {
    void print();
}
public class quiz6_2_007 {
    public static void main(String[] args) {
        Negative n = new Negative() {
            @Override
            public int neg(int x) {
                return -x;
            }
        };

        System.out.println(n.neg(10));

        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("안녕!");
            }
        };

        p.print();
    }
}