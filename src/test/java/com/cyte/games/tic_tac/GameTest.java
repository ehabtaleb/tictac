package com.cyte.games.tic_tac;

import org.junit.Assert;
import org.junit.Test;


public class GameTest {
	
	@Test
    public void gameCreation3()
    {
		Game tictac = new Game(3);
        Assert.assertNotNull("could not create game", tictac);
    }
	
	@Test
	public void gameInitiated3Empty(){
		Game tictac = new Game(3);
		tictac.initGame();
        Assert.assertEquals("---------",  tictac.getGrid().toString());
	}
}
