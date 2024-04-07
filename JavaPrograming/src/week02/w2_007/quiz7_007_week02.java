package week02.w2_007;

import java.util.Scanner;

public class quiz7_007_week02 {
    public static void main(String[] args) {
        //2133007
        //황스일
        int i, j, n;
        Scanner in = new Scanner(System.in);
        System.out.print("1~9까지의 수를 입력하시오 : ");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 7; j > 0; j--) {
                if (i + j == 8 || i==j ) {
                    System.out.printf("%d", j);
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        System.out.println("\n");
    }
}

