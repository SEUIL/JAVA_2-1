package easyjava.final_exam.week11.quiz_1;

//내부 클래스(인스턴스 멤버 클래스)
public class quiz_1_007 {
	private String secret = "비공개";
	String s = "외부";

	class MemberClass {
		String s = "내부";

		public void show1() {
			System.out.println("내부 클래스"); //2.출력: 내부클래스
			System.out.println(secret);//3.출력: 비공개

			System.out.println(s); //4.출력: 내부

			System.out.println(quiz_1_007.this.s); //5.출력: 외부
			System.out.println(MemberClass.this.s); //6.출력: 내부
			System.out.println(this.s); //7.출력: 내부
		}

		// static String s3 = "정적 멤버 필드";
		// static void show2() {}
		//내부 클래스 내부에 정적변수나 메서드를 포한 할 수 없다.
	}

	public static void main(String[] args) {
		quiz_1_007 m = new quiz_1_007();
		MemberClass m1 = m.new MemberClass();

		System.out.println(m1.s); //1.출력: 내부
		m1.show1();
	}
}