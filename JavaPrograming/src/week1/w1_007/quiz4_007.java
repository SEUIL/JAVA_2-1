package week1.w1_007;

import java.util.Scanner;

public class quiz4_007 {
    public static void main(String[] args) {
        //2133007
        //황스일

        int num, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오 >>");
        num = scanner.nextInt();

        if (num >= 1 && num <= 99){
            int a,b;
            a = num / 10;
            b = num % 10;

            if (a != 0 && a % 3 == 0){
                count++;
                //심의 자리 정수에 3,6,9중 하나가 있는 경우 count 증가
            }
            if (b != 0 && b % 3 == 0){
                count++;
                //1의 자리 정수에 3,6,9중 하나가 있는 경우 count 증가
            }
        }else {
            System.out.println("숫자가 범위를 벗어났습니다.");
        }
        clap(count);
    }

    public static void clap(int count){
        switch (count){
            case 1:
                System.out.println("박수 짝");
                break;
            case 2:
                System.out.println("박수 짝짝");
                break;
            default:
                System.out.println("박수 없음");
        }
    }
}
