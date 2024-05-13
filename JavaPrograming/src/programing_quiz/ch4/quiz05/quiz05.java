package easyjava.programing_quiz.ch4.quiz05;

public class quiz05 {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a==b);
    }
}

// 선을 나타내는 클래스
class Line {
    int line; // 선의 길이를 나타내는 변수

    // 생성자: 선의 길이를 초기화하는 역할을 함
    Line(int line){
        this.line = line;
    }

    // 다른 선과 길이를 비교하여 같은지 여부를 반환하는 메서드
    boolean isSameLine(Line l){
        if (this.line == l.line) { // 현재 선과 입력된 선의 길이가 같은 경우
            return true; // true 반환
        } else {
            return false; // false 반환
        }
    }
}

