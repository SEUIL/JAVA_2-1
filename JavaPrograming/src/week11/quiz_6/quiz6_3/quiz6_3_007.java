package easyjava.week11.quiz_6.quiz6_3;

 //7장 인터페이스
interface Negative {
    int neg(int x);
}

interface Printable {
    void print();
}

class NegativeImpl implements Negative {
    @Override
    public int neg(int x) {
        return -x;
    }
}

class PrintableImpl implements Printable {
    @Override
    public void print() {
        System.out.println("안녕!");
    }
}

public class quiz6_3_007 {
    public static void main(String[] args) {
        Negative n = new NegativeImpl();
        System.out.println(n.neg(10));

        Printable p = new PrintableImpl();
        p.print();
    }
}
