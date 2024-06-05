package ws_2_ex2_007.exam2_007.ex1;

import java.util.Scanner;

class Scholarstu{
    private int math;
    private int english;
    public Scholarstu(){};
    public Scholarstu(int math, int english){
        this.math = math;
        this.english = english;
    };
    public int getMath(){
        return math;
    }

    public void setMath(int x){
        this.math = x;
    }
    public int findAvg(){
        return (math + english)/2;
    }
    public boolean equals(Object obj){
        Scholarstu other = (Scholarstu) obj;
        if(findAvg() != other.findAvg()) { //평균이 같지 않으면
            return false;
        }else{
            return true;
        }
    }

}

public class prob1_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scholarstu s[] = new Scholarstu[2];

        for (int i=0; i<s.length; i++){
            System.out.print("수학,영어값 입력>> ");
            int math = scanner.nextInt();
            int english = scanner.nextInt();
            s[i] = new Scholarstu(math,english);
        }
        for (int i=0; i<s.length; i++){
            System.out.println("s["+i+"] 평균은"+ s[i].findAvg());
            if(s[i].equals(s[i+1])){
                System.out.println("s[0]과 s[1]은 같다.");
            }else{
                System.out.println("s[0]과 s[1]은 다르다.");
            } try{
                Scholarstu x = s[3];
            }catch (ArrayIndexOutOfBoundsException x){
                System.out.println("배열의 첨자가 범위를 벗어남");
                break;
            }

            //예외처리 (배열의 첨자가 범위를 벗어난 경우)
        }
    }
}


