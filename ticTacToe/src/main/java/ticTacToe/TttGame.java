package ticTacToe;

import java.util.Scanner;

public class TttGame {
	Scanner scanner;
	
	public static final int EMPTY = 0;
	public static final int EX = 1;
	public static final int OH = 2;
	
	public static int size;
	public static int[][] board;
	public static int winner;
	
	public TttGame() {
		size = 3;
		board = new int[size][size];
	}
	
	public static void main(String[] args) {
		size = 3;
		board = new int[size][size];
		printBoard();
	}
	
	public static void printBoard() {
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				printCell(board[row][col]);
				if (col != size-1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (row != size - 1) {
				System.out.println("-----------");
			}
		}
	}
	
	public static void printCell(int content) {
		switch (content) {
		case EMPTY: System.out.print("   "); break;
		case EX: System.out.print(" X "); break;
		case OH: System.out.print(" O "); break;
		}
	}
	
	public static void checkWin(int row, int col) {
		
	}
	
	public static void checkRow(int row) {
		int lineSize = 0;
		for (int box : board[row]) {
			if (box == row) {
				lineSize++;
			}
		}
		if (lineSize == size) {
			winner = row;
		}
	}
	
	public static void checkCol(int col) {
		int lineSize = 0;
		for (int[] row : board) {
			if (row[col] == col) {
				lineSize++;
			}
		}
		if (lineSize == size) {
			winner = col;
		}
		
	}
	
	public static void checkDiag(int row, int col) {
		if (size % 2 == 0
				|| (!(row == 0 || row == size-1)
				&& !(col == 0 || col == size-1))
				&& !(row == (size-1)/2 && col == (size-1)/2) ) {
			return;
		}
		
	}
}
