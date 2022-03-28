package lesson5.homework;

import java.util.Scanner;

public class Game {
    final static int EMPTY = 0;
    final static int CROSS = 1;
    final static int ZERO = 2;

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        System.out.println("Game  start!");
        Scanner scanner = new Scanner(System.in);
        showTheMap(matrix);
        boolean isWin = false;
        int move = 1;
        while (!isWin && move != 10) {
            if (move % 2 != 0) {
                System.out.println("Player 1 (X) enter coordinates (row and column, counting from one):");
                boolean isCoordinatesCorrect = false;
                int y = 0;
                int x = 0;
                while (!isCoordinatesCorrect) {
                    y = scanner.nextInt() - 1;
                    x = scanner.nextInt() - 1;
                    if (y > 2 || y < 0 || x > 2 || x < 0 || matrix[y][x] != EMPTY) {
                        System.out.println("Wrong coordinate value entered, please try again!");
                    } else {
                        isCoordinatesCorrect = true;
                    }
                }
                matrix[y][x] = CROSS;
                isWin = checkCondition(matrix, y, x, CROSS);
            } else {
                System.out.println("Player 2 (0) вenter coordinates (row and column, counting from one):");
                boolean isCoordinatesCorrect = false;
                int y = 0;
                int x = 0;
                while (!isCoordinatesCorrect) {
                    y = scanner.nextInt() - 1;
                    x = scanner.nextInt() - 1;
                    if (y > 2 || y < 0 || x > 2 || x < 0 || matrix[y][x] != EMPTY) {
                        System.out.println("Wrong coordinate value entered, please try again!");
                    } else {
                        isCoordinatesCorrect = true;
                    }
                }
                matrix[y][x] = ZERO;
                isWin = checkCondition(matrix, y, x, ZERO);
            }
            move++;
            showTheMap(matrix);
        }
        if (move == 10 && !isWin) {
            System.out.println("Draw!");
        }
    }

    public static void showTheMap(int[][] fields) {
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields.length; j++) {
                int value = fields[i][j];
                String valueFinal = (value == EMPTY ? " " : (value == CROSS ? "X" : "0"));
                System.out.printf("%1s", valueFinal);
                if (j != fields.length - 1) {
                    System.out.printf("|");
                }
            }
            System.out.println("");
        }
    }

    public static boolean checkCondition(int[][] fields, int y, int x, int moveType) {
        //Проверка строки на совпадение
        int countOfMatchesY = 0;
        int countOfMatchesX = 0;
        int countOfMatchesMainDiag = 0;
        int countOfMatchesRightDiag = 0;
        for (int i = 0; i < fields.length; i++) {
            if (fields[y][i] == moveType) {
                countOfMatchesY++;
            }
            if (fields[i][x] == moveType) {
                countOfMatchesX++;
            }
            if (fields[i][i] == moveType) {
                countOfMatchesMainDiag++;
            }
            if (fields[i][fields.length - 1] == moveType) {
                countOfMatchesRightDiag++;
            }
        }
        if (countOfMatchesX == 3 || countOfMatchesY == 3 || countOfMatchesMainDiag == 3 || countOfMatchesRightDiag == 3) {
            System.out.println("you win!");
            return true;
        } else {
            return false;
        }
    }
}