package easyjava.programing_quiz2.ch08.quiz05;

public class quiz05 {
    public static void main(String[] args) {
        show(new String("멘붕"));
        show(new StringBuilder("meltdown"));
        show(new StringBuffer("!@#"));
//        show(new Date())  // 오류 발생
    }
    public static void show(Object o){
        System.out.println(o);
    }
}
