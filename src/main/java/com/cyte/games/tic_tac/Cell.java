package com.cyte.games.tic_tac;

public class Cell {

	private int row;
	private int col;

	public Cell(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}

	public int getCol() {
		// TODO Auto-generated method stub
		return this.col - 1;
	}

	public int getRow() {
		// TODO Auto-generated method stub
		return this.row - 1;
	}

	@Override
	public String toString() {
		return "("+this.row+","+this.col+")";
	}
}
