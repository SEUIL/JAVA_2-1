package easyjava.programing_quiz.ch5.quiz03;

public class quiz03 {
    public static void main(String[] args) {
        for (Direction d : Direction.values()) {    // values()는 모든 열거타입상수를 반환
            System.out.print(d + " ");
        }
    } // 동 서 남 북
}

enum Direction{
    동, 서, 남, 북
}