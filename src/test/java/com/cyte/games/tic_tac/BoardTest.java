package com.cyte.games.tic_tac;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.cyte.games.tic_tac.player.BotPlayer;
import com.cyte.games.tic_tac.player.HumanPlayer;
import com.cyte.games.tic_tac.player.Player;
import com.cyte.games.tic_tac.player.PlayerStrategy;
import com.cyte.games.tic_tac.player.PromptCommand;

@RunWith(MockitoJUnitRunner.class)
public class BoardTest {
	private Game tictac;
	private Player playerX;
	private Player playerO;
	private HumanPlayer HumanPlayerO1;
	
	@Mock PlayerStrategy manulStrategy;
	@Mock PromptCommand prompt;
	
	@Before
	public void init(){
		tictac = new Game(3);
		playerX = new BotPlayer("X");
		playerO = new BotPlayer("O");
		HumanPlayerO1 = new HumanPlayer("O", manulStrategy);
		
	}

	@Test
	public void humanPlayerMarkCornerSquare(){
		
		HumanPlayerO1.playTurn(tictac,new Cell(1,1));
		
		assertEquals(tictac.toString(), "O--------");
	}
	
	@Test
	public void askHumanPlayerForMoveAndMarkCornerSquare() throws Exception{
		
		when(manulStrategy.getStratgy()).thenReturn(prompt);
		when(prompt.nextMove()).thenReturn(new Cell(1,1));
		
		Cell  cornerCell = HumanPlayerO1.getNextMove();
		HumanPlayerO1.playTurn(tictac,cornerCell );
		
		assertEquals(tictac.toString(), "O--------");
	}
	
	@Test
	public void gameCreation3() {
		
		assertNotNull("could not create game", tictac);
	}

	@Test
	public void gameInitiated_withSize3_Empty() {
		
		assertEquals(tictac.toString(), "---------");
	}
	
	@Test
	public void playerMarkXInCenter(){
		playerX.playTurn(tictac,new Cell(2,2));
		
		assertEquals(tictac.toString(), "----X----");
	}
	
	@Test
	public void playerMarkXInFilledSquare_shouldGiveFalse(){
		boolean valideMove = playerX.playTurn(tictac,new Cell(2,2));
		assertEquals(valideMove, true);
		boolean NonValideMove = playerX.playTurn(tictac,new Cell(2,2));
		assertEquals(NonValideMove, false);
	}

	@Test
	public void playerMark2X1OInRow_shouldNotWinTheGame(){
		playerX.playTurn(tictac,new Cell(2,2));
		playerX.playTurn(tictac,new Cell(2,1));
		playerO.playTurn(tictac,new Cell(2,3));
		
		assertEquals(tictac.checkWinningMove(), false);
	}
	
	@Test
	public void playerMark3XInRow_shouldWinTheGame(){
		playerX.playTurn(tictac,new Cell(2,2));
		playerX.playTurn(tictac,new Cell(2,1));
		playerX.playTurn(tictac,new Cell(2,3));
		
		assertEquals(tictac.checkWinningMove(), true);
	}
}
