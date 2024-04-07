package easyjava.Quiz4_5_6;

//문자열과 문자를 매개변수 값으로 가지는 다음 메서드가 있다.
// 문자열 s에 포함된 문자 c 의 개수를 반환하도록 메서드를 구현하는 프로그램을 작성하시오.
// static int countChar(String s, char c) { }
// -String 클래스가 제공하는 charAt() 메서드를 이용

public class quiz5_1 {
    static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println( countChar("jazz", 'z') );
    }
}
