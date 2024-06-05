package easyjava.week14.quiz_6;

import java.io.*;
import java.util.*;

public class quiz_6_007 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char again = 'n';
        String secret;
        StringBuffer dashes;
        int leftCount;
        boolean done;
        String guess;
        String guesses;
        char letter;
        Words words = new Words("D:\\temp\\words.txt");
        do {
            secret = words.getRandomWord();
            guesses = "";
            done = false;
            leftCount = 6;
            dashes = makeDashes(secret);
            while (!done) { //2
                System.out.println("추측할 단어입니다 : " + dashes);
                System.out.println("지금까지 추측한 내용입니다 : " + guesses);
                System.out.print("추측한 문자를 입력하세요 : ");
                guess = in.next();
                if (guess.length() > 1) {
                    if (guess.equals(secret))
                        System.out.println("승리!");
                    else
                        System.out.println("실패.");
                    done = true;
                } else {
                    letter = guess.charAt(0);
                    guesses += letter;
                    if (secret.indexOf(letter) < 0) {
                        --leftCount;
                        System.out.print("추측을 잘못했습니다 - ");
                    } else
                        matchLetter(secret, dashes, letter);
                    System.out.println(leftCount + "번 더 추측할 수 있습니다.");
                    if (leftCount == 0) {
                        System.out.println("실패.");
                        done = true;
                    }
                    if (secret.equals(dashes.toString())) {
                        System.out.println("승리!");
                        done = true;
                    }
                }
            }
            System.out.print("한 번 더 게임할래요 (y/n)?: ");
            again = in.next().charAt(0);
        } while (again == 'Y' || again == 'y');
    }

    public static void matchLetter(String secret, StringBuffer dashes, char
            letter) {
        for (int index = 0; index < secret.length(); index++)
            if (secret.charAt(index) == letter)
                dashes.setCharAt(index, letter);
        System.out.print("정확한 추측입니다 - ");
    }

    public static StringBuffer makeDashes(String s) {
        StringBuffer dashes = new StringBuffer(s.length());
        for (int count = 0; count < s.length(); count++)
            dashes.append('-');
        return dashes;
    }
}

class Words { //3
    private String fileName;
    private Random r = new Random();

    public Words(String fileName) {
        this.fileName = fileName;
    }

    public String getRandomWord() {
        String line = null;
        int n = r.nextInt(10);
        try (BufferedReader in = new BufferedReader(new
                FileReader(fileName));) {
            while (n-- >= 0)
                line = in.readLine();
        } catch (Exception e) {
        }
        return line;
    }
}