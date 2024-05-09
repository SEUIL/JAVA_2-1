package easyjava.week10.quiz_1;

public class quiz_1_2_007 {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			int x = array[3];
		}
		catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("원소가 존재하지 않습니다.");
		}
		catch (Exception e) {
			System.out.println("어이쿠!!!");
		}
		System.out.println("종료.");
	}
}