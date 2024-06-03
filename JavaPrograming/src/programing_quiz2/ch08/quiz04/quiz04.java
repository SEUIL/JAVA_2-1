package easyjava.programing_quiz2.ch08.quiz04;

// 테스트용 클래스
public class quiz04 {
    public static void main(String[] args) {
        // 주사위 객체 생성 후 결과 출력
        System.out.println(new Dice().roll()); // 주사위 굴리기 결과 출력
    }
}

// 주사위 클래스 정의
class Dice {
    // 주사위를 굴려서 나오는 값을 반환하는 메서드
    int roll() {
        return (int) (Math.random() * 6) + 1; // 1부터 6까지의 난수 생성
    }
}
