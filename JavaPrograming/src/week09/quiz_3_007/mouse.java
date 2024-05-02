package easyjava.week09.quiz_3_007;

class Mouse { //Obj 클래스에서 물려받은 메서드를 그대로 사용
    String name;
    public Mouse(String name) {
        this.name = name; }
}
class Keyboard {
    String name;
    public Keyboard(String name) {
        this.name = name; }
    public boolean equals(Object obj) { // equals 메서드를 재정의합니다. Object 클래스의 equals를 오버라이딩합니다.
        if (obj instanceof Keyboard) { // 입력된 객체가 Keyboard 클래스의 인스턴스인지 확인합니다.
            Keyboard k = (Keyboard) obj; // 입력된 객체를 Keyboard 타입으로 캐스팅합니다.
            if (name.equals(k.name)){ // 현재 객체의 name 속성과 입력된 객체의 name 속성을 비교합니다.
                return true; // 두 name 속성이 같다면 true를 반환합니다.
            }
        }
        return false; // 그렇지 않으면 false를 반환합니다.
    }

    public String toString() {//???
        return "키보드입니다."; }
}