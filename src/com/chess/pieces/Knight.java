package com.chess.pieces;

public class Knight extends Piece {
	public Knight(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'n';
		} else {
			this.symbol = 'N';
		}
	}
}