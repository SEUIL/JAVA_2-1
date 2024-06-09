package easyjava.final_exam.week11.quiz_6.quiz_4;

// 지역 중첩 클래스 데모
public class LocalDemo {
	public static void main(String[] args) {
		// main 메서드 내에서 정의된 지역 클래스
		class Eagle extends Bird {
			// Bird 클래스의 move 메서드를 재정의
			public void move() {
				System.out.println("독수리4가 난다~~~.");
			}
		}
		Bird e = new Eagle(); // 지역 클래스의 인스턴스 생성
		e.move(); // 지역 클래스의 move 메서드 호출
	}
}