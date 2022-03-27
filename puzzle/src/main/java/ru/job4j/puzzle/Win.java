package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != 0) {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] array, int row) {
        boolean result = true;
        for (int index  = 0; index  < array[row].length; index ++) {
            if (array[row][index] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] array, int column) {
        boolean result = true;
        for (int row = 0; row < array.length; row++) {
            if (array[row][column] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
