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
    public boolean equals(Object obj) { //메서드 오버라이딩,업캐스팅
        if (obj instanceof Keyboard) {
            Keyboard k = (Keyboard) obj;
            if (name.equals(k.name)){
                return true;
            }
        }
        return false; }
    public String toString() {//???
        return "키보드입니다."; }
}