package com.cyte.games.tic_tac;


public class Game {
	
	private int dim;
	private Row[] rows;
	
	
	public Game(int dim) {
		super();
		this.dim = dim;
		this.rows = new Row[dim];
		for (int i = 0; i < rows.length; i++) {
			rows[i] = new Row(dim);
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		for (Row row : rows) {
			buf.append(row.toString());
			//buf.append("\n");
		}
		return buf.toString();
	}

	public boolean mark(String mark, Cell cell) {
		return rows[cell.getRow()].mark(mark,cell.getCol());
	}

	public boolean checkWinningMove() {
		// TODO Auto-generated method stub
		return checkRows();
	}

	private boolean checkRows() {
		for (int i = 0; i < rows.length; i++) {
			if(rows[i].isWinner() == true)
				return true;
		}
		return false;
	}

	
	
	

}
