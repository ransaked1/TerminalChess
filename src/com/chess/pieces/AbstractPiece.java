package com.chess.pieces;

public abstract class AbstractPiece {

	protected int color;
	protected int positionX;
	protected int positionY;
	protected char symbol;

	public AbstractPiece(int color, int positionX, int positionY) {
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