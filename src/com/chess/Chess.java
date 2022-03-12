package com.chess;

import com.chess.board.Board;
import java.util.Scanner;

public class Chess {
	public static void main(String[] args) {
		Board board = new Board();
		Scanner input = new Scanner(System.in);

		System.out.println("Success!");
		System.out.print("\033[H\033[2J");
		System.out.flush();

    while (true) {
			board.getSquare(6, 1).getPiece().move(board, 1, 4, 1);
			board.getSquare(4, 1).getPiece().move(board, 1, 3, 1);
			board.getSquare(3, 1).getPiece().move(board, 1, 2, 1);
			board.getSquare(2, 1).getPiece().move(board, 1, 1, 1);
			board.getSquare(2, 1).getPiece().move(board, 1, 1, 2);
			board.getSquare(1, 2).getPiece().move(board, 1, 0, 1);

			board.getSquare(1, 5).getPiece().move(board, 0, 2, 5);
			board.getSquare(2, 5).getPiece().move(board, 0, 3, 5);
			board.getSquare(3, 5).getPiece().move(board, 0, 4, 5);
			board.getSquare(4, 5).getPiece().move(board, 0, 5, 5);
			board.getSquare(5, 5).getPiece().move(board, 0, 6, 4);
			board.getSquare(6, 4).getPiece().move(board, 0, 7, 3);

      board.drawWhite();
			//board.drawBlack();
			//System.out.print("Player move: ");
			//String in = input.nextLine();
      System.out.print("\033[H\033[2J");
      System.out.flush();
			break;
		}
	}
}