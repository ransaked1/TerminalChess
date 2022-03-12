package com.chess.pieces;

import com.chess.board.*;

public class King extends AbstractPiece implements Piece {
	public King(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'k';
		} else {
			this.symbol = 'K';
		}
	}

	public boolean move(Board board, int playerColor, int x, int y) {
		return true;
	}
}