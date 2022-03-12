package com.chess.pieces;

public class King extends Piece {
	public King(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'k';
		} else {
			this.symbol = 'K';
		}
	}
}