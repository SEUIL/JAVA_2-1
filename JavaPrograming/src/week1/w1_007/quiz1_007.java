package week1.w1_007;

import java.util.Scanner;

public class quiz1_007 {
    public static void main(String[] args) {
        //2133007
        //황스일
        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        int x = in.nextInt();

        int sum;
        sum = x % 10;
        x /= 10;
        sum += x %10;
        x /= 10;
        sum += x %10;
        x /= 10;
        sum += x;
        System.out.println("각 자릿수의 합 = "+sum);
        System.out.printf("결과 값 16진수 출력 = %x",sum);

//        System.out.println();
//        String hex = Integer.toHexString(sum);
//        System.out.println("결과 값 16진수 출력 = "+hex);


    }
}
