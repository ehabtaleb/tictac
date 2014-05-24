/**
 * 
 */
package com.cyte.games.tic_tac;

import java.io.IOException;

/**
 * @author ehab
 *
 */
public class Ticdriver {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Game tictac = new Game(3);
		tictac.initGame();
		tictac.StartGame();

	}

}
