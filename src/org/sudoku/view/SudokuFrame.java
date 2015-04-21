package org.sudoku.view;

import javax.swing.JFrame;

public class SudokuFrame extends JFrame {
	private static final long serialVersionUID = -499399327855697621L;
	private SudokuGrid grid;
	
	public SudokuFrame() {
		grid = new SudokuGrid();
	}
	
	public SudokuGrid getGrid() {
		return grid;
	}
}