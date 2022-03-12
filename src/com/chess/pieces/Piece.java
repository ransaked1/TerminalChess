package com.chess.pieces;

public abstract class Piece {

	private int color;
	private int positionX;
	private int positionY;
	protected char symbol;

	public Piece(int color, int positionX, int positionY) {
		this.color = color;
		this.positionX = positionX;
		this.positionY = positionY;
		this.symbol = symbol;
	}

	public int getColor() {
		return color;
	}

	public int getX() {
		return positionX;
	}

	public void setX(int positionX) {
		this.positionX = positionX;
	}

	public int getY() {
		return positionY;
	}

	public void setY(int positionY) {
		this.positionY = positionY;
	}

	public char getSymbol() {
		return symbol;
	}
}