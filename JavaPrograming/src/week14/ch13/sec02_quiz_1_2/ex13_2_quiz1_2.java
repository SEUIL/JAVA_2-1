package easyjava.week14.ch13.sec02_quiz_1_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex13_2_quiz1_2 {
    public static void main(String[] args) {
        String input = "C:\\Temp\\org.txt";
        String output = "C:\\Temp\\dup.txt";

        try {
            FileInputStream fis = new FileInputStream(input);
            FileOutputStream fos = new FileOutputStream(output);
            int c;
            while ((c = fis.read()) != -1) //한 바이트씩 읽고, 한 바이트씩 쓴다.
            {
                System.out.print((char) c);
                fos.write(c);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
        }
    }
}

