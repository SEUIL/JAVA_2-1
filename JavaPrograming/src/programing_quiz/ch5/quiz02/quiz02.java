package easyjava.programing_quiz.ch5.quiz02;

public class quiz02 {
    public static void main(String[] args) {
        System.out.println(sumExceptFirst(1, 2, 3, 4));
        int arr[] = { 2, 3 };
        System.out.println(sumExceptFirst(1, arr));
        System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
    }

    private static int sumExceptFirst(int a,int...v){
        int sum = 0;
        for (int i : v) {
            sum += i;
        }
        return sum;
    }
}
