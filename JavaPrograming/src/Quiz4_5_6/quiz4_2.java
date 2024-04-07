package easyjava.Quiz4_5_6;
import java.util.Scanner;

// 3과목의 평균 성적을 구하는 Grade 클래스를 정의하시오.
// - 3개의 과목은 int 타입의 math, science, English 필드에 저장하고 각 필드의 접근 지정자는 private으로 선언
//  - 생성자 오버로딩으로 입력 받은 3개의 과목을각 필드에 저장하는 생성자를 정의
//- 세 과목의 평균을 구해 리턴하는 average()메서드를 정의
//- main 메서드에서 키보드로 3과목을 입력 받아 객체 생성 시 각 필드에 입력 값을 저장하고 평균 값을 출력

class Grade{
    private int math;
    private int science;
    private int English;

    Grade(int math, int science, int English){
        this.math = math;
        this.science = science;
        this.English = English;
    }

    int average(){
        return (math+science+English)/3;
    }
}

public class quiz4_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("3과목 순서대로 입력");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int English = scanner.nextInt();

        Grade grade = new Grade(math,science,English);

        System.out.println("평균: " + grade.average());


    }
}

