package easyjava.week14.ch13.sec02_quiz_1_2;

import java.io.*;

public class ex13_2_quiz_1_2_2 {
    public static void main(String[] args) {
        String input = "C:\\Temp\\org.txt";
        String output = "C:\\Temp\\dup.txt";
        try (FileInputStream fis = new FileInputStream(input);
             FileOutputStream fos = new FileOutputStream(output))
        {
            int c;
            while ((c = fis.read()) != -1) //한 바이트씩 읽고, 한 바이트씩 쓴다.
            {
                System.out.print((char) c);
                fos.write(c);
            }
        } catch (IOException e) {
        }
    } // 자동으로 close()메서드를 호출한다. <- quiz_1_2 와 비교했을때 차이점 공부해야될듯?
}
