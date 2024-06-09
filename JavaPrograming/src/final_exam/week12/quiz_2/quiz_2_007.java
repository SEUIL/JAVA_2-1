package easyjava.final_exam.week12.quiz_2;

interface UseThis {  void use();  }

public class quiz_2_007 {
    public void lambda() {
        String hi = "Hi!";

        UseThis u1 = new UseThis() {
            public void use() {
                System.out.println(this); ; //UserThis의 자식인 익명 개체
//                hi = hi + " Lambda."; //지역변수 final이여서 오류
            }
        };
        u1.use();

        UseThis u2 = () -> {
            System.out.println(this); //UserThisDemo 객체 의미
//                hi = hi + " Lambda."; ; //지역변수 final이여서 오류
        };
        u2.use();
    }

    public String toString() {
        return "UseThisDemo";
    }

    public static void main(String[] args) {
        int one = 1;
        new quiz_2_007().lambda();
//        Comparator<String> c = (challenge.one, two) -> challenge.one.length() - two.length();
    }
}
