package week03.w3_007;

public class quiz5_1_007 {
    //2133007
    //황스일
    static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length() ; i++){
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countChar("jazz", 'z') );
    }

}
