package com.chess.pieces;

import java.lang.Math;
import com.chess.board.*;

public class Pawn extends AbstractPiece implements Piece {

  public Pawn(int color, int positionX, int positionY) {
    super(color, positionX, positionY);

    if (color == 0) {
      this.symbol = 'p';
    } else {
      this.symbol = 'P';
    }
  }

  public boolean move(Board board, int playerColor, int x, int y) {
    // System.out.println(board.getSquare(positionX, positionY).getPiece() + " " + positionX + " " +
    // positionY);
    if (color != playerColor) return false;
    if (checkOnBoard(x, y)) return false;
    if (color == 1) {
      if (positionX == 6
          && positionX - x <= 2
          && board.getSquare(x, y).getPiece() == null
          && Math.abs(positionY - y) == 0) {
        return movePiece(board, x, y);
      } else if (positionX < 6
          && positionX - x == 1
          && board.getSquare(x, y).getPiece() == null
          && Math.abs(positionY - y) == 0) {
        return movePiece(board, x, y);
      } else if (positionX < 6
          && positionX - x == 1
          && board.getSquare(x, y).getPiece() != null
          && Math.abs(positionY - y) == 1
          && board.getSquare(x, y).getPiece().getColor() != color) {
        return movePiece(board, x, y);
      }
    } else {
      if (positionX == 1
          && positionX - x >= -2
          && board.getSquare(x, y).getPiece() == null
          && Math.abs(positionY - y) == 0) {
        return movePiece(board, x, y);
      } else if (positionX > 1
          && positionX - x == -1
          && board.getSquare(x, y).getPiece() == null
          && Math.abs(positionY - y) == 0) {
        return movePiece(board, x, y);
      } else if (positionX > 1
          && positionX - x == -1
          && board.getSquare(x, y).getPiece() != null
          && Math.abs(positionY - y) == 1
          && board.getSquare(x, y).getPiece().getColor() != color) {
        return movePiece(board, x, y);
      }
    }
    return true;
  }

  private boolean checkOnBoard(int x, int y) {
    if (x < 0 || x > 7 || y < 0 || y > 7) return true;
    return false;
  }

  private boolean movePiece(Board board, int x, int y) {
    if (x == 0 || x == 7) board.getSquare(x, y).setPiece(new Queen(color, x, y));
    else board.getSquare(x, y).setPiece(this);
    board.getSquare(positionX, positionY).removePiece();
    positionX = x;
    positionY = y;
    return true;
  }
}
