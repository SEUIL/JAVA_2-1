package easyjava.week10.quiz_3;

public class quiz_3_007 {
    public static void main(String[] args) {
        MyDate d = null;
        try {
            System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
        }catch (NullPointerException e){
            d = new MyDate();
            System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
        }
    }
}

class MyDate {
    int year = 2035;
    int month = 12;
    int day = 25;
}
