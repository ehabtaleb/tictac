package com.cyte.games.tic_tac;

 import org.junit.Assert;
import org.junit.Test;


public class GridTest {
	
	@Test
    public void firstRowWinner() throws CellOccupaiedException
    {
		Grid grid = new Grid(3);
		grid.init();
		grid.mark(0, "X");
		grid.mark(1, "X");
		grid.mark(2, "X");
		grid.draw();
        Assert.assertTrue(grid.horizontalRowWin());
    }
	
	@Test
    public void midRowWinner() throws CellOccupaiedException
    {
		Grid grid = new Grid(3);
		grid.init();
	
		grid.mark(3, "X");
		grid.mark(4, "X");
		grid.mark(5, "X");
		grid.draw();
		Assert.assertTrue(grid.horizontalRowWin());
    }
	
	@Test
    public void lastRowWinner() throws CellOccupaiedException
    {
		Grid grid = new Grid(3);
		grid.init();
		
		grid.mark(6, "X");
		grid.mark(7, "X");
		grid.mark(8, "X");
		grid.draw();
		Assert.assertTrue(grid.horizontalRowWin());
    }
	
}
