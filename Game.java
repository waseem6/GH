package BoardGame;

import java.awt.*;

import javax.swing.*;

public class Game extends JFrame {
	public Game()
	{
		setSize(1000,1000);
		GameBoard board = new GameBoard();
		
		board.setLocation(0, 0);
		add(board);
		add(new JLabel("" ));
	
		 
	
		
	}
	public static void main(String[] args)
	{
		Game exec = new Game();
		exec.setVisible(true);

	}
}
