package easyjava.final_exam.week14.quiz_3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class quiz_3_1_007 {
    public static void main(String[] args) {
        FileReader fr = null;
        File f = new File("C:\\temp\\phone.txt");
        try {
            fr = new FileReader(f);
            System.out.println(f.getPath() + "를 출력합니다.");
            while (true) {
                int c = fr.read();
                if (c == -1)
                    break;
                System.out.print((char) c);
            }
            fr.close();
        } catch (IOException e) { // 파일을 저장할 수 없는 경우 예외
            e.printStackTrace();
        }
    }
}
