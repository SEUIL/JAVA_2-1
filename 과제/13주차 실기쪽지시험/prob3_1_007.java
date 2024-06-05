package ws_2_ex2_007.exam2_007.ex3.prob3_1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

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
}

public class prob3_1_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scholarstu s[] = new Scholarstu[2];

        for (int i=0; i<s.length; i++){
            System.out.print(i + ": 수학,영어값 입력>> ");

            int math = scanner.nextInt();
            int english = scanner.nextInt();

            s[i] = new Scholarstu(math,english);
        }

        Arrays.sort(s, new Comparator<Scholarstu>() {
            @Override
            public int compare(Scholarstu first, Scholarstu second) {
                return first.findAvg() - second.findAvg();
            }
        });

        System.out.println("평균(avg) 비교");
        for (int i=0; i<s.length; i++){
            System.out.println("s["+i+"] 평균은 "+ s[i].findAvg());
        }

        Arrays.sort(s, new Comparator<Scholarstu>() {
            @Override
            public int compare(Scholarstu first, Scholarstu second) {
                return first.getMath() - second.getMath();
            }
        });

        System.out.println("수학(math) 비교");
        for (Scholarstu scholarstu : s) {
            System.out.println(scholarstu.getMath());
        }
    }
}


