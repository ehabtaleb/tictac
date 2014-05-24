package com.cyte.games.tic_tac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class PrompCommand {
	
	private BufferedReader in ;
	private PrintWriter writer;

	public PrompCommand(InputStream in, OutputStream out) {
		super();
		this.in = new BufferedReader(new InputStreamReader(in));
		this.writer = new PrintWriter(new OutputStreamWriter(out));
	}

	public int getPlayerMove() throws IOException {
		
		return Integer.parseInt(in.readLine());
	}
	
}
