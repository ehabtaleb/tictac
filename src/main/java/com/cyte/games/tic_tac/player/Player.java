package com.cyte.games.tic_tac.player;

import com.cyte.games.tic_tac.Cell;
import com.cyte.games.tic_tac.Game;

public abstract class Player {




	public abstract String getMark();

	public boolean playTurn(Game tictac, Cell cell) {
		return tictac.mark(getMark(),cell);
	}

	

}