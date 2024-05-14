package easyjava.week11.quiz_4;

public class MemberDemo {
	class Eagle extends Bird { //멤버 중첩 클래스
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}

		public void sound() {
			System.out.println("휘익~~~.");
		}
	}

	Eagle e = new Eagle();

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move();
		m.e.sound();
	}
}