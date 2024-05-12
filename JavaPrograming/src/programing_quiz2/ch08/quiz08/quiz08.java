package easyjava.programing_quiz2.ch08.quiz08;

import java.util.Arrays;

public class quiz08 {
    public static void main(String[] args) {
        String proverb = "Empty vessels make the most sound.";

        // 영어 속담을 공백을 기준으로 단어로 분리하여 배열에 저장
        String[] tokens = proverb.split(" ");

        // 단어 개수 출력
        System.out.println("입력 : " + proverb);
        System.out.println("단어 개수 : " + tokens.length);

        // 정렬
        Arrays.sort(tokens);

        // 정렬된 토큰 출력
        System.out.print("정렬된 토큰 : ");
        for (String token : tokens) {
            System.out.print(token + ", ");
        }
    }
}
