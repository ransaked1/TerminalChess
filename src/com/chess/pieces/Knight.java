package com.chess.pieces;

import com.chess.board.*;

public class Knight extends AbstractPiece implements Piece {
	public Knight(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'n';
		} else {
			this.symbol = 'N';
		}
	}

	public boolean move(Board board, int playerColor, int x, int y) {
		return true;
	}
}