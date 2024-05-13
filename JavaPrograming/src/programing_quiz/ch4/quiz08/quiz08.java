package easyjava.programing_quiz.ch4.quiz08;

// 테스트를 위한 메인 클래스
public class quiz08 {
    public static void main(String[] args) {
        // 주사위 객체 생성
        Dice d = new Dice();
        // 주사위를 굴려서 나온 숫자 출력
        System.out.println("주사위의 숫자 : " + d.roll());
    }
}

// 주사위를 나타내는 클래스
class Dice{
    int face = 10; // 주사위의 면 수를 나타내는 변수 (디폴트 값은 10)

    // 주사위를 굴려서 나온 숫자를 반환하는 메서드
    double roll(){
        while(true){ // 무한 루프
            double v = Math.random() * face; // 0부터 face-1까지의 난수를 생성하여 v에 저장
            if (v >= 1.0 && v < 6.0){ // 만약 v가 1 이상 6 미만인 경우
                return (int) v; // 정수형으로 형변환하여 반환 (1부터 5까지의 숫자)
            }
        }
    }
}
