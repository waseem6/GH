package BoardGame;
import java.awt.*;

import javax.swing.*;


public class GameBoard extends JPanel {

	GameBoard()
	{
		setSize(600,600);
		JLabel board = new JLabel();
		JLabel chapel = new JLabel();
		JScrollPane scrollPane = new JScrollPane(board, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(600,600));
		board.setIcon(new ImageIcon(getClass().getResource("board.gif")));
		chapel.setIcon(new ImageIcon(getClass().getResource("chapel.gif")));
		scrollPane.setViewportView(board);
		add(scrollPane);
		
				
	}
}
