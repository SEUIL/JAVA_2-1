package easyjava.final_exam.week11.quiz_6.quiz_4;

// 익명 멤버 중첩 클래스 데모
public class Anonymous1Demo {
	// Bird 클래스를 상속받는 익명 클래스
	Bird e = new Bird() {
		// Bird 클래스의 move 메서드를 재정의
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}

		// 익명 클래스에 새로운 메서드 추가
		void sound() {
			System.out.println("휘익~~~.");
		}
	};

	public static void main(String[] args) {
		Anonymous1Demo a = new Anonymous1Demo();
		a.e.move(); // 익명 클래스의 move 메서드 호출
//        a.e.sound(); // 컴파일 에러: a.e는 부모 클래스 타입이므로 자식 클래스의 sound() 호출 불가
	}
}
