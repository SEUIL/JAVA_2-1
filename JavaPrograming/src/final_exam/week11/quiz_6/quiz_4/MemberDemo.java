package easyjava.final_exam.week11.quiz_6.quiz_4;

// 멤버 중첩 클래스 데모
public class MemberDemo {
	// 멤버 중첩 클래스 Eagle
	class Eagle extends Bird {
		// Bird 클래스의 move 메서드를 재정의
		public void move() {
			System.out.println("독수리3가 난다~~~.");
		}

		// 새로운 메서드 sound 추가
		public void sound() {
			System.out.println("휘익~~~.");
		}
	}

	Eagle e = new Eagle(); // 멤버 중첩 클래스의 인스턴스 생성

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move(); // 멤버 중첩 클래스의 move 메서드 호출
		m.e.sound(); // 멤버 중첩 클래스의 sound 메서드 호출
	}
}
