package week03.w3_007;

import java.util.Scanner;

//2133007
//황스일
public class quiz5_3_007 {
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;

        Scanner in = new Scanner(System.in);

        System.out.print("학생 수? ");
        numOfStudents = in.nextInt();

        scores = new int[numOfStudents];

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");

        for (int i=0; i < scores.length; i++) {
            System.out.print("학생 " + (i+1) + "의 성적: ");
            scores[i] = in.nextInt();
        }

        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");

        for (int i : scores) {
            System.out.println(i + " ");
        }
        System.out.println();

        for (int i = 0; i < scores.length; i++) {
            Score grade;
            if (scores[i] >= 90) {
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
            System.out.println("학생 " + (i + 1) + "의 등급은 " + grade.getDescription() + "입니다.");

        }
    }

    enum Score {
        A("최우수"), B("우수"), C("보통"), D("미흡"), E("탈락");

        private final String description; //description - 서술

        Score(String description){
            this.description = description;
        }

        public String getDescription(){
            return description;
        }
    }
}

    //성적 관리 프로그램을 문자열 연산, 배열 연산, for~ each문, 열거 타입을 적용하여 작성하시오.
// - 키보드로 학생 수를 입력 받고 입력된 학생 수에 해당하는 크기의 scores 배열을 생성한다.
// - for문을 이용해 학생 수 만큼 키보드로 성적을 입력 받고 입력 받은 후 for ~ each 문으로 출력한다.
// - for문과 if~ else문을 사용해 학생들의 등급을 열거 타입(클래스 타입)으로 정의해서 출력한다.