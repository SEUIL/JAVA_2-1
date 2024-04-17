package easyjava.week07.quiz7_5_2;

public interface Controllable {
    default void repair() {// 디폴트 메서드
        show("장비를 수리한다.");
    }

    static void reset() { // 정적 메서드
        System.out.println("장비를 초기화한다.");
    }

    private void show(String s) {
        System.out.println(s);
    }

    void turnOn(); //추상 메서드, 표준화

    void turnOff(); //추상 메서드, 표준화
}
