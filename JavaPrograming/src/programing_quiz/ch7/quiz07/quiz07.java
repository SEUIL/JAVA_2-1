package easyjava.programing_quiz.ch7.quiz07;

public class quiz07 {
    public static void main(String[] args) {
        Flyable f = new Flyable() {
            @Override
            public void speed() {
                System.out.println("속도");
            }

            @Override
            public void height() {
                System.out.println("높이");
            }
        };
        f.speed();
        f.height();
    }
}
interface Flyable {
    void speed();
    void height();
}