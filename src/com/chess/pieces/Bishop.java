package com.chess.pieces;

import com.chess.board.*;

public class Bishop extends AbstractPiece implements Piece {
	public Bishop(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'b';
		} else {
			this.symbol = 'B';
		}
	}

	public boolean move(Board board, int playerColor, int x, int y) {
		return true;
	}
}