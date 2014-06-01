package com.cyte.games.tic_tac;

public class Row {
	private static final String EMPTY = "-";
	private String[] values ;
	
	public Row(int dim) {
		values = new String[dim];
	for (int i = 0; i < values.length; i++) {
			values[i] = EMPTY;
		}
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		for (String v  : values) {
			buf.append(v);
		}
		return buf.toString();
	}

	public boolean mark(String mark, int col) {
		if(EMPTY.equals(values[col])){
			values[col] = mark;
			return true;
		}
		return false;
	}

	public boolean isWinner() {
		// TODO Auto-generated method stub
		return (toString().equals("XXX")?true:toString().equals("OOO"));
	}
	
}
