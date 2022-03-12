package com.chess.pieces;

public class Queen extends Piece {
	public Queen(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'q';
		} else {
			this.symbol = 'Q';
		}
	}
}