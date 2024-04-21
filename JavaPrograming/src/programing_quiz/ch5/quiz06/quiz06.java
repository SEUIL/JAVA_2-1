package easyjava.programing_quiz.ch5.quiz06;
import java.util.Arrays;
public class quiz06 {
    public static void main(String[] args) {
        int junBe[] = new int[]{1, 9, 6, 8, 4};
        String StrBe[] = new String[]{"참새", "비둘기", "독수리", "부엉이", "갈매기"};
        System.out.println(Arrays.toString(reverse(junBe)));
    }
    // 배열값으로 반환하기 위한 메서드(참조변수 또한 배열값)
    public static int[] reverse(int[] org) {
        int temp[] = new int[5];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 4 - i; j >= 0; j--) {
                temp[i] = org[j];
                break;
            }
        }
        return temp;
    }
}



