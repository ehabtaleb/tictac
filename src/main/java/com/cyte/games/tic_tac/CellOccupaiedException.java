package com.cyte.games.tic_tac;

public class CellOccupaiedException extends Exception {
	
	private int idx ;

	public CellOccupaiedException(int idx) {
		super();
		this.idx = idx;
	}
	
	

}
