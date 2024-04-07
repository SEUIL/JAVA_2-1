package week02.w2_007;

import java.util.Scanner;

class Gread{
    //2133007
    //황스일
    private int math,science,english;

    public Gread(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }
    public int average() {
        int average = (math + science + english) / 3;
        return average;
    }

}

public class quiz4_2_007_week02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();

        Gread me = new Gread(math,science,english);

        System.out.println("평균은 " + me.average());
        scanner.close();
    }
}
