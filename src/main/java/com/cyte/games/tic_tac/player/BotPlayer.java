package com.cyte.games.tic_tac.player;


public class BotPlayer extends Player {

	private String mark;

	public BotPlayer(String mark) {
		this.mark = mark;
	}

	@Override
	public String getMark() {
		return this.mark;
	}

}
