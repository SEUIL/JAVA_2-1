package easyjava.week11.quiz_2;

public class quiz_2_007 {
	private String s1 = "외부";

	void method() {
		int x = 1;
		class LocalClass {
			String s2 = "내부";
			String s3 = s1;

			public void show() {
				System.out.println("지역 클래스");
				//x = 2;

				//x는 method()지역변수이므로 final이기에 참조가능하나
				//x는 final이여서 변경 불가
			}
		}

		LocalClass lc = new LocalClass();
		System.out.println(lc.s2); //출력 : 내부
		lc.show(); //출력 : 지역 클래스
	}

	public static void main(String[] args) {
		quiz_2_007 lcd = new quiz_2_007();
		lcd.method();
	}
}