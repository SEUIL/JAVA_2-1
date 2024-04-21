package easyjava.programing_quiz.ch5.quiz05;

import java.util.Scanner;

public class quiz05 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);
        String[] star = new String[10];


        System.out.println("숫자 10개를 입력하라.");
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
            star[i] = "";
        }

        for (int i = 0; i < 10; i++) {
            if (num[i] >= 90) {
                star[9] += "*";
            }else if(num[i] >= 80){
                star[8] += "*";
            }else if(num[i] >= 70){
                star[7] += "*";
            }else if(num[i] >= 60){
                star[6] += "*";
            }else if(num[i] >= 50){
                star[5] += "*";
            }else if(num[i] >= 40){
                star[4] += "*";
            }else if(num[i] >= 30){
                star[3] += "*";
            }else if(num[i] >= 20){
                star[2] += "*";
            }else if(num[i] >= 10){
                star[1] += "*";
            }else if(num[i] > 0 && num[i] < 10) {
                star[0] += "*";
            }
        }

        for(int i=0; i<10; i++){

        }

        System.out.println("0~9: "+star[0]);
        for (int i=1; i<10; i++){
            System.out.println(i+"0~"+i+"9: "+star[i]);
        }
    }
}
//        System.out.println("숫자 10개를 입력하라."); // 이 코드를 쓰면 축약은 가능하지만 입력값이 100이 넘어갈경우 오류
//        for (int i = 0; i < 10; i++) {
//            star[i] = "";
//            num[i] = scanner.nextInt();
//            int index = num[i] / 10;
//            index = (index == 10) ? 9 : index; // 100점은 90점대로 그룹화
//            star[index] += "*";
//        }

//        System.out.println("0~9: "+star[0]);
//        System.out.println("10~19: "+star[1]);
//        System.out.println("20~29: "+star[2]);
//        System.out.println("30~39: "+star[3]);
//        System.out.println("40~49: "+star[4]);
//        System.out.println("50~59: "+star[5]);
//        System.out.println("60~69: "+star[6]);
//        System.out.println("70~79: "+star[7]);
//        System.out.println("80~89: "+star[8]);
//        System.out.println("90~99: "+star[9]);