package com.cyte.games.tic_tac;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.cyte.games.tic_tac.player.HumanPlayer;
import com.cyte.games.tic_tac.player.PlayerStrategy;
import com.cyte.games.tic_tac.player.PromptCommand;

@RunWith(MockitoJUnitRunner.class)
public class HumanPlayerTest {
	
	private Game tictac;
	@InjectMocks
	private HumanPlayer humanPlayerO1;
	@Mock PromptCommand prompt;
	@Mock PlayerStrategy manulStrategy;
	
	@Before
	public void init(){
		tictac = new Game(3);
		humanPlayerO1 = new HumanPlayer("O",manulStrategy);
	}

	@Test
	public void playeEnterUpperleftCorner() throws Exception {
		//SdoReturn(prompt).when(humanPlayerO1).getPrompt();
		when(manulStrategy.getStratgy()).thenReturn(prompt);
		when(prompt.nextMove()).thenReturn(new Cell(1,1));
		Cell cell = humanPlayerO1.getNextMove();
		
		humanPlayerO1.playTurn(tictac, cell);
		
		assertEquals("O--------", tictac.toString() );
	}

}
