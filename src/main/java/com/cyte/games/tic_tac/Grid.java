package com.cyte.games.tic_tac;

public class Grid {

	public static final String EMPTY = "-";
	private String[] cells;
	private int dim;

	public Grid(int dim) {
		this.dim = dim;
		this.cells = new String[dim * dim];
	}

	public void init() {
		for (int i = 0; i < cells.length; i++) {
			cells[i] = EMPTY;
		}

	}

	public void draw() {
		System.out.println("["+toString()+"]");

	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		for (int i = 0; i < cells.length; i++) {
			buf.append(cells[i]);
		}
		return buf.toString();
	}

	public void mark(int input, String mark) throws CellOccupaiedException {
		if(this.cells[input] == EMPTY){
			this.cells[input] = mark;
		}else{
			throw new CellOccupaiedException(input);
		}
		
	}

	public boolean horizontalRowWin() {
	
		int start = 0;
		//[xxx]------
		//---[xxx]---
		for (int j = 0; j < this.dim; j++) {		
			if( isWinningRow(start))
				return true;
			
			start = start+dim;
		}
		return false;
	}

	private boolean isWinningRow(int start) {
		String token = this.cells[start];
		if(EMPTY.equals(token))
				return false;
		for (int i = start ; i < (dim+start); i++) {
			if(!token.equals(this.cells[i])){
				return false;
			}
		}
		return true;
	}

	public boolean verticalRowWin() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean diagonalRowWin() {
		// TODO Auto-generated method stub
		return false;
	}
}
