package easyjava.final_exam.week11.quiz_6.quiz_4;

// 또 다른 익명 클래스 데모
public class Anonymous2Demo {
	public static void main(String[] args) {
		// Bird 클래스를 상속받는 익명 클래스
		Bird b = new Bird() {
			// Bird 클래스의 move 메서드를 재정의
			public void move() {
				System.out.println("독수리2가 난다~~~.");
			}
		};
		b.move(); // 익명 클래스의 move 메서드 호출
	}
}
