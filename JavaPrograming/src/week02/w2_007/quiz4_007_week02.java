package week02.w2_007;

import java.util.Scanner;

public class quiz4_007_week02 {
    public static void main(String[] args) {
        //2133007
        //황스일

        int num, count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("1~99사이의 숫자를 입력하시오: ");
        num = in.nextInt();
        if (num >= 1 && num <= 99) {
            int a, b;
            a = num / 10;
            b = num % 10;
            if (a != 0 && a % 3 == 0) {
                count++;
            }
            if (b != 0 && b % 3 == 0) {
                count++;
            }
        } else {
            System.out.println("숫자가 범위를 벗어났습니다.");
        }
        System.out.println(howMany(count));
        in.close();
    }
    public static String howMany ( int n){
        return switch (n) {
            case 2 -> "박수짝짝";
            case 1 -> "박수 짝";
            default -> "박수 없음";
        };
    }
}
