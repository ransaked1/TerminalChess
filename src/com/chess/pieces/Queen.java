package com.chess.pieces;

import com.chess.board.*;

public class Queen extends AbstractPiece implements Piece {
	public Queen(int color, int positionX, int positionY) {
		super(color, positionX, positionY);

		if (color == 0) {
			this.symbol = 'q';
		} else {
			this.symbol = 'Q';
		}
	}

	public boolean move(Board board, int playerColor, int x, int y) {
		return true;
	}
}