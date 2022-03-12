package com.chess;

import com.chess.board.Board;

public class Chess {
	public static void main(String[] args) {
		Board board = new Board();
		System.out.println("Success!");
		board.draw();
	}
}