package com.cyte.games.tic_tac.player;

import com.cyte.games.tic_tac.Cell;

public class HumanPlayer extends Player {
	private String mark;
	
	private PlayerStrategy manulStratgy;

	public HumanPlayer(String mark, PlayerStrategy manulStratgy ) {
		this.mark = mark;
		this.manulStratgy = manulStratgy; 
	}
	
	public Cell getNextMove() throws Exception {
		return getPrompt().nextMove();
	}

	 Prompt getPrompt() {
		return this.manulStratgy.getStratgy();
	}

	@Override
	public String getMark() {
		return this.mark;
	}

}
