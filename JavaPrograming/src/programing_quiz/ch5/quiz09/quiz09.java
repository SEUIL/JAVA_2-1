package easyjava.programing_quiz.ch5.quiz09;

import java.util.Scanner;

public class quiz09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 행의 수 입력
        System.out.print("행의 수를 입력하세요: ");
        int rows = scanner.nextInt();

        // 열의 수 입력
        System.out.print("열의 수를 입력하세요: ");
        int cols = scanner.nextInt();

        // 지뢰 확률 입력
        System.out.print("지뢰 확률을 입력하세요 (0 ~ 1): ");
        double mineProbability = scanner.nextDouble();

        // 배열 생성
        String[][] mineField = generateMineField(rows, cols, mineProbability);

        // 결과 출력
        System.out.println("\n지뢰 숨기기 전:");
        printMineField(mineField);

        // 주변 지뢰 개수 계산
        String[][] mineFieldWithCounts = calculateSurroundingMineCount(mineField);

        // 결과 출력
        System.out.println("\n지뢰 숨긴 후:");
        printMineField(mineFieldWithCounts);

        scanner.close();
    }

    // 지뢰를 랜덤하게 배치하여 배열 생성
    public static String[][] generateMineField(int rows, int cols, double mineProbability) {
        String[][] field = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (Math.random() < mineProbability) {
                    field[i][j] = "*"; // 지뢰가 있는 경우
                } else {
                    field[i][j] = "-"; // 지뢰가 없는 경우
                }
            }
        }
        return field;
    }

    // 주변 지뢰 개수 계산하여 배열 반환
    public static String[][] calculateSurroundingMineCount(String[][] mineField) {
        int rows = mineField.length;
        int cols = mineField[0].length;
        String[][] result = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineField[i][j].equals("*")) {
                    result[i][j] = "*"; // 지뢰가 있는 경우
                } else {
                    int count = countSurroundingMines(mineField, i, j);
                    result[i][j] = String.valueOf(count);
                }
            }
        }

        return result;
    }

    // 지정된 위치 주변의 지뢰 개수 계산
    public static int countSurroundingMines(String[][] mineField, int row, int col) {
        int count = 0;
        int rows = mineField.length;
        int cols = mineField[0].length;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < cols && mineField[i][j].equals("*")) {
                    count++;
                }
            }
        }

        return count;
    }

    // 배열 출력
    public static void printMineField(String[][] mineField) {
        for (String[] row : mineField) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
