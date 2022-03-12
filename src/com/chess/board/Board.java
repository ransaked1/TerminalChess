package com.chess.board;

import com.chess.pieces.*;

public class Board {

  private Square[][] board = new Square[8][8];

  public Board() {
    initSquares();
		initWhite();
		initBlack();
  }

  private void initSquares() {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (i % 2 == 0) {
          if (j % 2 == 0) {
            board[i][j] = new Square(1);
          } else {
            board[i][j] = new Square(0);
          }
        } else {
          if (j % 2 == 0) {
            board[i][j] = new Square(0);
          } else {
            board[i][j] = new Square(1);
          }
        }
      }
    }
  }

	private void initWhite() {
		// Pawns
		for (int i = 0; i < 8; i++) {
			board[6][i].setPiece(new Pawn(1, 6, i));
		}
		// Rooks
		board[7][0].setPiece(new Rook(1, 7, 0));
		board[7][7].setPiece(new Rook(1, 7, 7));

		// Knights
		board[7][1].setPiece(new Knight(1, 7, 1));
		board[7][6].setPiece(new Knight(1, 7, 6));

		// Bishops
		board[7][2].setPiece(new Bishop(1, 7, 2));
		board[7][5].setPiece(new Bishop(1, 7, 5));

		// Queen & King
		board[7][3].setPiece(new Queen(1, 7, 3));
		board[7][4].setPiece(new King(1, 7, 4));
	}

	private void initBlack() {
		// Pawns
		for (int i = 0; i < 8; i++) {
			board[1][i].setPiece(new Pawn(0, 1, i));
		}

		// Rooks
		board[0][0].setPiece(new Rook(0, 0, 0));
		board[0][7].setPiece(new Rook(0, 0, 7));

		// Knights
		board[0][1].setPiece(new Knight(0, 0, 1));
		board[0][6].setPiece(new Knight(0, 0, 6));

		// Bishops
		board[0][2].setPiece(new Bishop(0, 0, 2));
		board[0][5].setPiece(new Bishop(0, 0, 5));

		// Queen & King
		board[0][3].setPiece(new Queen(0, 0, 3));
		board[0][4].setPiece(new King(0, 0, 4));
	}

  public void draw() {
    System.out.println("   a b c d e f g h");
    System.out.println("  +----------------+");
    for (int i = 0; i < 8; i++) {
      System.out.print(i + 1 + " |");
      for (int j = 0; j < 8; j++) {
        if (board[i][j].getPiece() == null) {
          System.out.print("  ");
        } else {
					System.out.print(board[i][j].getPiece().getSymbol() + " ");
				}
      }
      System.out.println("| " + (i + 1));
    }
    System.out.println("  +----------------+");
    System.out.println("   a b c d e f g h");
  }
}
