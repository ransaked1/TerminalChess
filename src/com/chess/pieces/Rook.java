package com.chess.pieces;

public class Rook extends Piece {
	public Rook(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'r';
		} else {
			this.symbol = 'R';
		}
	}
}