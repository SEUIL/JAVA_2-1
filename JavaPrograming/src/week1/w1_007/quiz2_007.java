package week1.w1_007;

import java.util.Scanner;

public class quiz2_007 {
    public static void main(String[] args) {
        //2133007
        //황스일
        Scanner in = new Scanner(System.in);
        System.out.print("0~15의 양수(10진수) : ");
        int num = in.nextInt();
        int mask = 1 << 3; // mask = 1000
        System.out.print("2진수 : ");
        System.out.print(((num & mask) == 0) ? 0 : 1);
        // num(8일때): 1000 & 1000 = 0000 => 1출력

        mask = mask >> 1; // 오른쪽으로 1비트 이동한다.
        System.out.print(((num & mask) == 0) ? 0 : 1);
        // num(8일때): 1000 & 0100 = 0000 => 0출력
        mask = mask >>1; // 오른쪽으로 1비트 이동한다.
        System.out.print(((num & mask) == 0) ? 0 : 1);
        // num(8일때): 1000 & 0010 = 0000 => 0출력
        mask = mask >>1; // 오른쪽으로 1비트 이동한다.
        System.out.print(((num & mask) == 0) ? 0 : 1);
        // num(8일때): 1000 & 0001 = 0000 => 0출력
    }
}
