package org.gr40in.model;

public class TicTacToe {
    private static final int SIZE = 3;
    private static char[][] gameField = new char[SIZE][SIZE];
    private static final char playerMark = 'X';
    private static final char aiMark = '0';
    private static final char emptyMark = '.';


    public static void startGame(){
        initialize();
//        while (true){
//            showGameField();
//        }
    }


    public static void initialize() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                gameField[y][x] = emptyMark;
            }
        }
        showGameField();

    }

    public static void showGameField() {
        for (int y = 0; y < SIZE; y++) {
            System.out.print(" | ");
            for (int x = 0; x < SIZE; x++) {
                System.out.print(gameField[y][x] + " | ");
            }
            System.out.println();
        }
    }
}
