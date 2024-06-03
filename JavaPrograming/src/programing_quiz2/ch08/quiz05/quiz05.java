package easyjava.programing_quiz2.ch08.quiz05;

// 테스트용 클래스
public class quiz05 {
    public static void main(String[] args) {
        // 다양한 타입의 객체를 전달하여 show 메서드 호출
        show(new String("멘붕")); // String 객체 전달
        show(new StringBuilder("meltdown")); // StringBuilder 객체 전달
        show(new StringBuffer("!@#")); // StringBuffer 객체 전달
//        show(new Date())  // 오류 발생
    }

    // Object 타입을 인자로 받는 show 메서드
    public static void show(Object o) {
        System.out.println(o); // 전달받은 객체를 출력
    }
}
