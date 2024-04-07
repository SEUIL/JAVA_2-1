package week1.w1_007;

import java.util.Scanner;

public class quiz5_007 {
    public static void main(String[] args) {
        //2133007
        //황스일
        Scanner scanner = new Scanner(System.in);

        int i,sum = 1,n=0;

        String formula = "1";
        while (true){
            System.out.print("자연수 n값을 입력하시오. n이 0이면 종료하시오! ");
            n = scanner.nextInt();
            while (n % 2 == 1){
                sum += n;
                formula += "+" + n;
                System.out.println( formula + " = " + sum);
                break;
            }
            while (n % 2 == 0){
                sum -=n;
                formula += "-" + n;
                System.out.println( formula + " = " + sum);
                break;
            }

            if (n == 0){
                break;
            }
        }


    }
}
