package easyjava.programing_quiz2.ch10.quiz02;


interface Wordable {
    void word();
}

public class quiz02 {
    public static void main(String[] args) {
        // Wordable 타입의 배열을 람다식으로 초기화
        Wordable[] m = {
                () -> System.out.println("나비"),
                () -> System.out.println("가위"),
                () -> System.out.println("마차"),
                () -> System.out.println("다리")
        };

        // 반복문을 사용하여 배열의 각 요소의 word 메서드를 호출
        for (Wordable w : m) {
            w.word();
        }
    }
}
