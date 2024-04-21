package easyjava.programing_quiz.ch5.quiz07;

public class quiz07 {
    public static void main(String[] args) {
        int a[] = {3, 2, 4, 1, 5};
        int b[] = {3, 2, 4, 1};
        int c[] = {3, 2, 4, 1, 5};
        int d[] = {2, 7, 1, 8, 2};

        Return(a, b);
        Return(a, c);
        Return(a, d);
        Return(b, c);
        Return(b, d);
        Return(c, d);
    }

    public static void Return(int[] a,int[] b){
        int count=0;

        if(a.length==b.length){
            for(int i=0; i<a.length; i++){

                if(a[i]==b[i]){
                    count++;
                }
            }
        }
        if(count == a.length){
            System.out.println("같습니다.");
        }else{
            System.out.println("다릅니다.");
        }

    }
}
