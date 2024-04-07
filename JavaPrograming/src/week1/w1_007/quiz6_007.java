package week1.w1_007;

import java.util.Scanner;

public class quiz6_007 {
    public static void main(String[] args) {
        //2133007
        //황스일
        int i,j,n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~9까지의 수를 입력하시오? ");
        n = scanner.nextInt();

        for (i = n; i>=1; i--){
            if (i == n || i==n-(n-1)){
                for (j = n; j>=1; j--){
                    System.out.print(j);
                }
            }else {
                System.out.print(n);
                for (int k=1; k<=n-2; k++){
                    System.out.print(" ");
                }
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
