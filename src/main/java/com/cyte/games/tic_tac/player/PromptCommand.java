package com.cyte.games.tic_tac.player;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

import com.cyte.games.tic_tac.Cell;

public class PromptCommand extends Prompt {
	
	BufferedReader input;
	Writer writer;

	public PromptCommand(InputStream in, OutputStream out) {
		this.input = new BufferedReader(new InputStreamReader(in));
		this.writer = new PrintWriter(out);
	}

	public Cell nextMove() throws Exception {
		writer.write("Enter your nex move x,y");
		String move = input.readLine();
		return new Cell(getX(move), getY(move));
	}
 
	int getX(String move) {
		return Integer.parseInt(move.split(",")[0]);
	}

	int getY(String move) {
		return Integer.parseInt(move.split(",")[1]);
	}

}
