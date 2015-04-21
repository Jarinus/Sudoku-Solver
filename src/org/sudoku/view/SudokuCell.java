package org.sudoku.view;

import javax.swing.JPanel;

public class SudokuCell extends JPanel {
	private static final long serialVersionUID = -8027145405769761645L;
	private String value;
	
	public SudokuCell() {
		resetValue();
	}
	
	public void setValue(int value) {
		if(value < 1 | value > 9)
			return;
		this.value = Integer.toString(value);
	}
	
	public void resetValue() {
		value = null;
	}
	
	public int getValue() {
		return Integer.parseInt(value);
	}
}