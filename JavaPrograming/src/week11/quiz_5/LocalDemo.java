package easyjava.week11.quiz_5;

public class LocalDemo {
	public static void main(String[] args) {
		class Eagle extends Bird {
			public void move() { //메서드 오버라이딩
				System.out.println("독수리가 난다~~~.");
			}
		}

		Bird e = new Eagle(); //main()메서드의 지역변수
		e.move();
	}
}