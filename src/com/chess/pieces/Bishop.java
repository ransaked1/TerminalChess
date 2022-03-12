package com.chess.pieces;

public class Bishop extends Piece {
	public Bishop(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'b';
		} else {
			this.symbol = 'B';
		}
	}
}