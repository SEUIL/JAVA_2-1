package easyjava.final_exam.week14.quiz_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class quiz_2_007 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        File f = new File("C:\\temp\\phone.txt");
        try {
            fw = new FileWriter(f);
            Scanner scanner = new Scanner(System.in);
            System.out.println("전화번호 입력 프로그램입니다.");
            while (true) {
                System.out.print("이름 전화번호 >> ");
                String line = scanner.nextLine(); // 한줄을 읽는다. if (line.equals("그만"))
                fw.write(line); // 한 줄 띄어 저장하기 위해 "\r\n"을 붙인다.
                break;
            }
            System.out.println(f.getPath() + "에 저장하였습니다.");
            scanner.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}