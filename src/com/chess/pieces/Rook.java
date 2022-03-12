package com.chess.pieces;

import com.chess.board.*;

public class Rook extends AbstractPiece implements Piece {
	public Rook(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'r';
		} else {
			this.symbol = 'R';
		}
	}

	public boolean move(Board board, int playerColor, int x, int y) {
		return true;
	}
}