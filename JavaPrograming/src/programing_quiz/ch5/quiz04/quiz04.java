package easyjava.programing_quiz.ch5.quiz04;

import java.util.Scanner;

public class quiz04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            String text = "";
            System.out.print("URL을 입력하세요 : "+text); //URL을 입력하세요 : www.java.com(입력 값)
            text = scanner.nextLine();

            if (text.equals("bye")){
                break;
            }

            if (text.endsWith("com")){ //www.java.com 'com'으로 끝납니다.
                System.out.println(text + " 'com' 으로 끝납니다");
            }else{
                System.out.println(text + " 'com'이 없습니다");
            }

            if(text.contains("java")){ //www.java.com 'java'를 포함합니다
                System.out.println(text + " 'java'를 포함합니다");
            }else{
                System.out.println(text + " 'java'를 포함하지 않습니다.");
            }
        }
    }
}
//URL을 입력하세요 : www.java.com(입력 값)
//www.java.com 'com'으로 끝납니다.
//www.java.com 'java'를 포함합니다
//URL을 입력하세요 : bye