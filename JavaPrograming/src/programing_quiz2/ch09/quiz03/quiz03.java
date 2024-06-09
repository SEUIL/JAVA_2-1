package easyjava.programing_quiz2.ch09.quiz03;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;
public class quiz03 {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";
        try {
            showTokens(s, ", ");
        } catch (NoSuchElementException e) {
            System.out.println("끝");
        }
    }

    public static void showTokens(String s1, String s2) throws NoSuchElementException  {
        StringTokenizer stringTokenizer = new StringTokenizer(s1,s2);
        while (true){
            System.out.println(stringTokenizer.nextToken());
        }
    }
    // while(true) {}을 사용하는 showTokens() 메서드 추가
}
