package com.chess.pieces;

import com.chess.board.*;

public interface Piece {

	public boolean move(Board board, int playerColor, int x, int y);

	public int getColor();

	public int getX();

	public void setX(int positionX);

	public int getY();

	public void setY(int positionY);

	public char getSymbol();
}