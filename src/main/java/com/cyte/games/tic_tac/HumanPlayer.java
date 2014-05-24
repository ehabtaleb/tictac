package com.cyte.games.tic_tac;

import java.io.IOException;

public class HumanPlayer extends Player {

	private String mark;
	private PrompCommand prompt;

	public HumanPlayer(String mark) {
		this.mark = mark;
		prompt = new PrompCommand(System.in, System.out );
	}

	public void play(Grid grid) throws IOException {
		boolean moveAccepted = false;
		while(!moveAccepted){
		try {
			grid.mark(prompt.getPlayerMove(), mark);
			moveAccepted = true;
		} catch (CellOccupaiedException e) {
			// TODO Auto-generated catch block
			moveAccepted = false;
		} 
		}
		
	}
}
