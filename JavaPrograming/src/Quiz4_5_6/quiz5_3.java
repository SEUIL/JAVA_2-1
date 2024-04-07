package easyjava.Quiz4_5_6;

import java.util.Scanner;

//성적 관리 프로그램을 문자열 연산, 배열 연산, for~ each문, 열거 타입을 적용하여 작성하시오.
// - 키보드로 학생 수를 입력 받고 입력된 학생 수에 해당하는 크기의 scores 배열을 생성한다.
// - for문을 이용해 학생 수 만큼 키보드로 성적을 입력 받고 입력 받은 후 for ~ each 문으로
// 출력한다.
// - for문과 if~ else문을 사용해 학생들의 등급을 열거 타입(클래스 타입)으로 정의해서 출력한다.
// enum Score { A("최우수"), B("우수"), C("보통"), D("미흡"), E("탈락"); //필드 //생성자 //메서드 }
public class quiz5_3 {
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);

        System.out.print("학생 수: "); //빈칸
        numOfStudents = in.nextInt(); //빈칸
        scores = new int[numOfStudents]; //빈칸

        System.out.print(numOfStudents + "명의 학생 성적 입력: ");

        for (int i = 0; i < scores.length; i++){ //빈칸
            scores[i]= in.nextInt();             //빈칸
        }

        System.out.println(numOfStudents +"명의 학생 성적은 다음과 같다.");
        for (int score : scores) {      //빈칸
            System.out.print(score+" ");//빈칸
        }
        System.out.println();

        for (int i = 0; i < scores.length; i++) {       //빈칸
            Score grade;                                //빈칸
            if (scores[i] >= 90) {                      //빈칸
                grade = Score.A;
            } else if (scores[i] >= 80) {
                grade = Score.B;
            } else if (scores[i] >= 70) {
                grade = Score.C;
            } else if (scores[i] >= 60) {
                grade = Score.D;
            } else {
                grade = Score.E;
            }
            System.out.println("학생 " + (i + 1) + "의 등급은 " +
                    grade.toString() + "입니다.");

        }
    }
}
enum Score {
    A("최우수"), B("우수"), C("보통"), D("미흡"), E("탈락");
    //필드 //생성자 //메서드
    private String s;           //빈칸
    Score(String s){            //빈칸
        this.s = s;             //빈칸
    }
    public String toString(){   //빈칸
        return s;
    }
}