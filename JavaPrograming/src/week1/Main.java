package week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력하고싶은 문자열을 입력하시오");
        String a = scanner.nextLine();
        int c = a.length();

        for (int i = 1; i <= 5; i++){
            for (int j = 0; j <= c*2 +1; j++){
                System.out.print(" ");
            }
            System.out.println(a);
        }
        for (int i = 1; i<11; i++){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}


