package easyjava.week09.quiz_1_.other;
import easyjava.week09.quiz_1_.One;
public class Three {
    public void print() {
        One o = new One();
        // System.out.println(o.secret); 접근 불가
        // System.out.println(o.roomate); 접근 불가
        // System.out.println(o.child); 접근 불가
        System.out.println(o.anybody);
    }
}
