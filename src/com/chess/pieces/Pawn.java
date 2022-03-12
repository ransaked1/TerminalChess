package com.chess.pieces;

public class Pawn extends Piece {
	public Pawn(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'p';
		} else {
			this.symbol = 'P';
		}
	}
}