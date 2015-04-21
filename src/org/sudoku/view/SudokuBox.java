package org.sudoku.view;

import javax.swing.JPanel;

public class SudokuBox extends JPanel {
	private static final long serialVersionUID = 5611486841947899453L;
	private SudokuCell[] cells;
	
	public SudokuBox() {
		cells = new SudokuCell[9];
		for(int i = 0; i < cells.length; i++) {
			cells[i] = new SudokuCell();
		}
	}
	
	public SudokuCell[] getCells() {
		return cells;
	}
	
	public SudokuCell getCell(int index) {
		if(index < 0 || index > 8) {
			System.out.println("Bad value at getCell(" + index + ") in SudokuBox : " + index);
			return null;
		}
		return cells[index];
	}
	
	public int getValue(int cellIndex) {
		return getCell(cellIndex).getValue();
	}
}