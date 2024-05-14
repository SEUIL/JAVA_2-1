package easyjava.week11.quiz_5;

public class Anonymous1Demo { //익명 멤버 중첩 클래스
	Bird e = new Bird() {
	//생성자의 이름을 부모 클래스 이름으로 대신하고 본체를 구현하는 익명 클래스
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}

		void sound() {
			System.out.println("휘익~~~.");
		}
	};

	public static void main(String[] args) {
		Anonymous1Demo a = new Anonymous1Demo();
		a.e.move();
//		a.e.sound();
		//a.e가 부모 클래스이므로 자식 클래스의 sound()를 호출할 수 없다.
	}
}