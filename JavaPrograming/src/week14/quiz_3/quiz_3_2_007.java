package easyjava.week14.quiz_3;

import java.io.*;
import java.util.*;

public class quiz_3_2_007 {
    public static void main(String[] args) {
        FileReader fr = null;
        File f = new File("c:\\temp\\phone.txt");
        try {
            fr = new FileReader(f);
            Scanner scanner = new Scanner(fr);
            System.out.println(f.getPath() + "를 출력합니다.");
            while (scanner.hasNext()) {
                String line = scanner.nextLine(); // 한줄을 읽는다. System.out.println(line);
            }
            fr.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

