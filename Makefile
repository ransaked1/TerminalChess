CC = javac

FLAGSCOMPILE = -d
FLAGSRUN = -cp

RM = rm -rf

PIECES = src/com/chess/pieces/*
BOARD = src/com/chess/board/*
GAME = src/com/chess/Chess.java

demo:
	@$(CC) $(FLAGSCOMPILE) classes $(PIECES) $(BOARD) $(GAME)
	@echo "MAKE DEMO IS DONE"
	@java $(FLAGSRUN) classes com.chess.Chess

all:
	@$(CC) $(FLAGSCOMPILE) classes $(PIECES) $(BOARD) $(GAME)
	@echo "MAKE ALL IS DONE"

clean:
	@$(RM) classes/com/chess/*
	@$(RM) classes/com/chess/Chess.class
	@echo "MAKE CLEAN IS DONE"
.PHONY: clean demo