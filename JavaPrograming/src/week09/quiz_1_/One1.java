package easyjava.week09.quiz_1_;

public class One1 extends One {
    void print(){
        // System.out.println(secret);오류
        System.out.println(roommate);
        System.out.println(child);
        System.out.println(anybody);
    }
    // void show() { }
    //오버라이딩할 때 접근 범위가 좁아지면 오류 발생
}
