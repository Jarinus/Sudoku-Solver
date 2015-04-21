package org.sudoku.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SudokuFrame extends JFrame {
	private static final long serialVersionUID = -499399327855697621L;
	private SudokuGrid grid;
	
	public SudokuFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setBackground(Color.DARK_GRAY);
		setPreferredSize(new Dimension(400, 400));
		
		JPanel panel = new JPanel();
		grid = new SudokuGrid();
		panel.add(grid);
		add(panel);
		
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public SudokuGrid getGrid() {
		return grid;
	}
}