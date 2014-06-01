package com.cyte.games.tic_tac.player;


public class PlayerStrategy {

	public PromptCommand getStratgy(){
		return new PromptCommand( System.in,  System.out);
	}

}
