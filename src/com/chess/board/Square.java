package com.chess.board;

import com.chess.pieces.*;

public class Square {

	private int color;
	private Piece piece = null;

	public Square(int color) {
		this.color = color;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public void removePiece() {
		this.piece = null;
	}
}