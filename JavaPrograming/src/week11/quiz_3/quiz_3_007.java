package easyjava.week11.quiz_3;

class Icon {
	interface Touchable {
		void touch();
	}
}

public class quiz_3_007 implements Icon.Touchable {
	public void touch() {
		System.out.println("아이콘을 터치한다.");
	}

	public static void main(String[] args) {
		Icon.Touchable btn = new quiz_3_007();
		//부모 					자식
		btn.touch();
	}
}