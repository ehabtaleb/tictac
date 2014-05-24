package com.cyte.games.tic_tac;

import java.io.IOException;

public class Game {
	
	private int dim;
	private Player PlayerX;
	private Player playerO;
	private Grid grid; //"---XOX---"
	
	public Game(int dim) {
		super();
		this.dim = dim;
		this.grid = new Grid(dim);
		this.playerO = new HumanPlayer("O");
		this.PlayerX = new BotPlayer("X");
	}
	
	
	public void initGame(){
		this.grid.init();
		this.grid.draw();
	}

	public void StartGame() throws IOException{
		Player p = PlayerX;
		while(!winningMove()){
			p = (p == PlayerX)? playerO:PlayerX;
			p.play(grid);
			this.grid.draw();
		}
	}

	private boolean winningMove() {
		if(this.grid.horizontalRowWin())
			return true;
		if(this.grid.verticalRowWin())
			return true;
		if(this.grid.diagonalRowWin())
			return true;
		return false;
	}


	public Grid getGrid() {
		return this.grid;
	}
	
	

}
