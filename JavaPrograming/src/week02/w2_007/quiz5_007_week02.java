package week02.w2_007;

import java.util.Scanner;

public class quiz5_007_week02 {
    public static void main(String[] args) {
        //2133007
        //황스일
        int i, sum, n;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("자연수 n값 입력 >> (n이 0이면 종료) ");
            n = in.nextInt();

            if (n == 0){
                break;
            }

            i = 1;
            sum = 0;
            while (i <= n) {
                if (i % 2 == 0) {
                    sum = sum - i;
                } else {
                    sum = sum + i;
                }

                System.out.printf("%d", i);
                if (i != n) {
                    System.out.printf("%c", (i % 2 == 0 ? '+' : '-'));
                }
                i++;
            }
            System.out.printf("= %d \n", sum);
        }
    }
}
