package week1.w1_007;

import java.util.Scanner;

public class quiz3_1_007 {
    public static void main(String[] args) {
        //2133007
        //황스일
        Scanner in = new Scanner(System.in);
        System.out.print("1~99사이의 정수를 입력하시오>>");
        int num = in.nextInt();

        int a = num / 10; //10의 자리
        int b = num % 10; //1의 자리
        int count = 0;

        if (num>=1 && num <=99) {
            System.out.print("박수");
            if (a == 3 || a == 6 || a == 9) {
                System.out.print("짝");
                count++;
            }
            if (b == 3 || b == 6 || b == 9) {
                System.out.println("짝");
                count++;
            }
            if (count == 0) {
                System.out.println("없음");
            }
        }else {
            System.out.println("숫자가 범위를 벗어남");
        }

    }
}
