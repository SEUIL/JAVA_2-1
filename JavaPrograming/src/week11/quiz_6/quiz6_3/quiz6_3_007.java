package easyjava.week11.quiz_6.quiz6_3;

 //7장 인터페이스
interface Negative {
    int neg(int x);
}

interface Printable {
    void print();
}

public class quiz6_3_007 implements Negative,Printable{
    public int neg(int x){
        return -x;
    }
    public void print(){
        System.out.println("안녕");
    }
    public static void main(String[] args) {

        quiz6_3_007 q = new quiz6_3_007();
        System.out.println(q.neg(10));
        q.print();
    }
}
