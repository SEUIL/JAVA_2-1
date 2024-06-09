package easyjava.final_exam.week10.quiz_1;

public class quiz_1_2_007 {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 }; // 크기가 3인 정수형 배열을 초기화

		try {
			// 배열의 네 번째 요소에 접근하려고 시도 (인덱스 3, 존재하지 않음)
			int x = array[3];
		} catch (ArrayIndexOutOfBoundsException e) {
			// 배열 인덱스 범위를 벗어난 경우 예외 처리
			System.out.println("원소가 존재하지 않습니다.");
		} catch (Exception e) {
			// 그 외 모든 예외를 처리
			System.out.println("어이쿠!!!");
		}

		// try-catch 블록이 종료된 후 실행
		System.out.println("종료.");
	}
}
